package com.github.catvod.spider.merge.x;

import android.view.accessibility.AccessibilityNodeInfo;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    /* renamed from: ۟ۡ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m9485() {
        if (C0013.m3167() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        }
        return null;
    }

    /* renamed from: ۟ۤۡۥۤ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m9486() {
        if (C0034.m6048() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤۦ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m9487() {
        if (C0028.m5152() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        }
        return null;
    }
}