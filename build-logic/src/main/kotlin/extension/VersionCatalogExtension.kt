package extension

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType

fun Project.getVersionCatalog(
    name: String = "libs",
): VersionCatalog = extensions
    .getByType<VersionCatalogsExtension>()
    .named(name)

internal val Project.libs: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal val VersionCatalog.versionKotlinCompiler: String
    get() = findVersionOrThrow("androidxKotlinCompiler")
internal val VersionCatalog.libAndroidxComposeBom: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidx-compose-bom")
//internal val VersionCatalog.libAndroidxComposeCompiler: Provider<MinimalExternalModuleDependency>
//    get() = findLibraryOrThrow("androidx-compose-compiler")
//internal val VersionCatalog.libAndroidxComposeFoundation: Provider<MinimalExternalModuleDependency>
//    get() = findLibraryOrThrow("androidx-compose-foundation")
internal val VersionCatalog.libAndroidxComposeMaterial3: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidx-compose-material3")
internal val VersionCatalog.libAndroidxComposeUiToolingPreview: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidx-compose-ui-tooling-preview")
internal val VersionCatalog.libAndroidxComposeUiTooling: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidx-compose-ui-tooling")
internal val VersionCatalog.libAndroidxComposeActivity: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidx-activity-compose")

private fun VersionCatalog.findLibraryOrThrow(name: String) =
    findLibrary(name)
        .orElseThrow { NoSuchElementException("Library $name not found in version catalog") }
private fun VersionCatalog.findVersionOrThrow(name: String) =
    findVersion(name)
        .orElseThrow { NoSuchElementException("Version $name not found in version catalog") }
        .requiredVersion