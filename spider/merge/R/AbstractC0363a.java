package com.github.catvod.spider.merge.r;

import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0363a {
    /* renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m9172(Object obj) {
        if (C0051.m8216() < 0) {
            return ((AccessibilityNodeInfo) obj).getUniqueId();
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m9173() {
        if (C0020.m4210() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        }
        return null;
    }

    /* renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9174(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            return LocaleList.matchesLanguageAndScript((Locale) obj, (Locale) obj2);
        }
        return false;
    }

    /* renamed from: ۥۣۢۤ, reason: contains not printable characters */
    public static void m9175(Object obj, Object obj2) {
        if (C0047.m7837() > 0) {
            ((AccessibilityNodeInfo) obj).setUniqueId((String) obj2);
        }
    }
}