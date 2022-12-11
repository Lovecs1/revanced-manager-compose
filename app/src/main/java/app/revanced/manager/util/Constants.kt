package app.revanced.manager.util

import android.os.Environment

private const val team = "revanced"
const val ghOrganization = "https://github.com/$team"
const val ghCli = "$team/revanced-cli"
const val ghPatches = "$team/revanced-patches"
const val ghPatcher = "$team/revanced-patcher"
const val ghManager = "$team/revanced-manager"
const val ghIntegrations = "$team/revanced-integrations"
const val tag = "ReVanced Manager"
val reVancedFolder =
    Environment.getExternalStorageDirectory().resolve("ReVanced").also { it.mkdirs() }