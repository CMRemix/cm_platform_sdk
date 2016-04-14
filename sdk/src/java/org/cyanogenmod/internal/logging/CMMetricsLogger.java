/**
 * Copyright (c) 2016, The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cyanogenmod.internal.logging;

import com.android.internal.logging.MetricsLogger;

/**
 * Serves as a central location for logging constants that is android release agnostic.
 */
public class CMMetricsLogger extends MetricsLogger {
    private static final int BASE = -Integer.MAX_VALUE;
    //Since we never want to collide, lets start at the back and move inward
    public static final int DONT_LOG = BASE + 1;

    public static final int ANONYMOUS_STATS = BASE + 2;
    public static final int APP_GROUP_CONFIG = BASE + 3;
    public static final int APP_GROUP_LIST = BASE + 4;
    public static final int BATTERY_LIGHT_SETTINGS = BASE + 5;
    public static final int BUTTON_SETTINGS = BASE + 6;
    public static final int CHOOSE_LOCK_PATTERN_SIZE = BASE + 7;
    public static final int DISPLAY_ROTATION = BASE + 8;
    public static final int LIVE_DISPLAY = BASE + 9;
    public static final int NOTIFICATION_LIGHT_SETTINGS = BASE + 10;
    public static final int NOTIFICATION_MANAGER_SETTINGS = BASE + 11;
    public static final int POWER_MENU_ACTIONS = BASE + 12;
    public static final int PREVIEW_DATA = BASE + 13;
    public static final int PRIVACY_GUARD_PREFS = BASE + 14;
    public static final int PRIVACY_SETTINGS = BASE + 15;
    public static final int PROFILE_GROUP_CONFIG = BASE + 16;
    public static final int PROFILES_SETTINGS = BASE + 17;
    public static final int SETUP_ACTIONS_FRAGMENT = BASE + 18;
    public static final int SETUP_TRIGGERS_FRAGMENT = BASE + 19;
    public static final int STYLUS_GESTURES = BASE + 20;
    public static final int TILE_ADB_OVER_NETWORK = BASE + 21;
    public static final int TILE_AMBIENT_DISPLAY = BASE + 22;
    public static final int TILE_COMPASS = BASE + 23;
    public static final int TILE_CUSTOM_QS = BASE + 24;
    public static final int TILE_CUSTOM_QS_DETAIL = BASE + 25;
    public static final int TILE_EDIT = BASE + 26;
    public static final int TILE_LIVE_DISPLAY = BASE + 27;
    public static final int TILE_LOCKSCREEN_TOGGLE = BASE + 28;
    public static final int TILE_NFC = BASE + 29;
    public static final int TILE_PERF_PROFILE = BASE + 30;
    public static final int TILE_PERF_PROFILE_DETAIL = BASE + 31;
    public static final int TILE_PROFILES = BASE + 32;
    public static final int TILE_PROFILES_DETAIL = BASE + 33;
    public static final int TILE_SCREEN_TIME_OUT = BASE + 34;
    public static final int TILE_SCREEN_TIME_OUT_DETAIL = BASE + 35;
    public static final int TILE_SYNC = BASE + 36;
    public static final int TILE_USB_TETHER = BASE + 37;
    public static final int TILE_VOLUME = BASE + 38;
    public static final int TILE_HEADS_UP = BASE + 39;
    public static final int TILE_BATTERY_SAVER = BASE + 40;
    public static final int TILE_THEMES = BASE + 41;
    public static final int TILE_CAFFEINE = BASE + 42;
    public static final int WEATHER_SETTINGS = BASE + 43;

    // CMRemix Tiles
    public static final int TILE_APP_CIRCLE_BAR = BASE + 44;
    public static final int TILE_APP_PICKER = BASE + 45;
    public static final int TILE_APP_SIDE_BAR = BASE + 46;
    public static final int TILE_BRIGHTNESS = BASE + 47;
    public static final int TILE_EXPANDED_DESKTOP = BASE + 48;
    public static final int TILE_GESTURE_ANYWHERE = BASE + 49;
    public static final int TILE_HARDWARE_KEYS = BASE + 50;
    public static final int TILE_KERNEL_ADIUTER = BASE + 51;
    public static final int TILE_KILL_APP = BASE + 52;
    public static final int TILE_LTE = BASE + 53;
    public static final int TILE_MUSIC = BASE + 54;
    public static final int TILE_NAVBAR = BASE + 55;
    public static final int TILE_PIE = BASE + 56;
    public static final int TILE_POWER_MENU = BASE + 57;
    public static final int TILE_REBOOT = BASE + 58;
    public static final int TILE_SCREEN_OFF = BASE + 59;
    public static final int TILE_SCREEN_RECORD = BASE + 60;
    public static final int TILE_SCREENSHOT = BASE + 61;
    public static final int TILE_SELINUX = BASE + 62;
    public static final int TILE_SOUND = BASE + 63;
    public static final int TILE_SYSTEM_UI_RESTART = BASE + 64;

    // CMRemix Settings
    public static final int ACTION_FRAGMENT = BASE + 65;
    public static final int AMBIENT_SETTINGS = BASE + 66;
    public static final int ANIMATION_CONTROL = BASE + 67;
    public static final int APP_CIRCLE_BAR = BASE + 68;
    public static final int APP_SIDE_BAR = BASE + 69;
    public static final int BATTERY_BAR = BASE + 70;
    public static final int BREATHING_NOTIFICATIONS = BASE + 71;
    public static final int CARRIER_LABEL = BASE + 72;
    public static final int CLOCK_SETTINGS = BASE + 73;
    public static final int CMREMIX_TWEAKS = BASE + 74;
    public static final int CMREMIX_UI_SETTINGS = BASE + 75;
    public static final int CUSTOM_LOGO = BASE + 76;
    public static final int FLING_SETTINGS = BASE + 77;
    public static final int GESTURE_ANYWHERE_SETTINGS = BASE + 78;
    public static final int INPUT_METHODS_SETTINGS = BASE + 79;
    public static final int KEYBOARD_ANIMATION_INTERFACE_SETTINGS = BASE + 80;
    public static final int LOCK_CLOCK = BASE + 81;
    public static final int LOCK_SCREEN_COLORS = BASE + 82;
    public static final int LOCK_SCREEN_SETTINGS = BASE + 83;
    public static final int LOCKSCREEN_SHORTCUT_FRAGMENT = BASE + 84;
    public static final int LOCKSCREEN_WALLPAPER = BASE + 85;
    public static final int LOCK_SCREEN_WEATHER_SETTINGS = BASE + 86;
    public static final int NAVIGATION_BAR = BASE + 87;
    public static final int NETWORK_TRAFFIC = BASE + 88;
    public static final int NOTIFICATION_COLOR_SETTINGS = BASE + 89;
    public static final int NOTIFICATION_PANEL = BASE + 90;
    public static final int OMNI_SWITCH = BASE + 91;
    public static final int PIE_COLOR = BASE + 92;
    public static final int PIE_CONTROL = BASE + 93;
    public static final int PIE_TARGETS = BASE + 94;
    public static final int PULSE_SETTINGS = BASE + 95;
    public static final int QS_COLORS = BASE + 96;
    public static final int QS_PANEL = BASE + 97;
    public static final int QS_VIBRATE = BASE + 98;
    public static final int RECENT_APP_SIDE_BAR = BASE + 99;
    public static final int RECENT_APP_SIDE_BAR_FRAGMENT = BASE + 100;
    public static final int RECENTS_PANEL_SETTINGS = BASE + 101;
    public static final int RECENTS_STYLES = BASE + 102;
    public static final int SCREEN_AND_ANIMATIONS = BASE + 103;
    public static final int SMARTBAR_SETTINGS = BASE + 104;
    public static final int SOUND_SETTINGS = BASE + 105;
    public static final int STATUS_BAR_COLORS = BASE + 106;
    public static final int STATUS_BAR_WEATHER = BASE + 107;
    public static final int VOLUME_STEP = BASE + 108;
}
