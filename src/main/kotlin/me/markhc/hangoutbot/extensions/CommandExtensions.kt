package me.markhc.hangoutbot.extensions

import me.aberrantfox.kjdautils.api.dsl.command.*
import me.markhc.hangoutbot.services.*

val commandPermissions: MutableMap<Command, Permission> = mutableMapOf()
val commandAvailableInDms: MutableMap<Command, Boolean> = mutableMapOf()

var Command.requiredPermissionLevel: Permission
    get() = commandPermissions[this] ?: DEFAULT_REQUIRED_PERMISSION
    set(value) {
        commandPermissions[this] = value
    }

var Command.availableThroughDMs: Boolean
    get() = commandAvailableInDms[this] ?: false
    set(value) {
        commandAvailableInDms[this] = value
    }