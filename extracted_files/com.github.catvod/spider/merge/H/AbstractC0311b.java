package com.github.catvod.spider.merge.h;

import android.app.Notification;
import android.content.ClipData;
import android.location.LocationRequest;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.view.ContentInfo;
import android.view.textclassifier.TextLinks;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0311b {
    public static /* bridge */ /* synthetic */ LocationRequest c(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver f(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* bridge */ /* synthetic */ ContentInfo h(Object obj) {
        return (ContentInfo) obj;
    }

    /* renamed from: ۟۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m8533(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            ((Notification.CallStyle) obj).setBuilder((Notification.Builder) obj2);
        }
    }

    /* renamed from: ۟۠ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static ContentInfo.Builder m8534(Object obj, int i) {
        if (C0030.m5375() > 0) {
            return ((ContentInfo.Builder) obj).setSource(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ContentInfo.Builder m8535(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((ContentInfo.Builder) obj).setLinkUri((Uri) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Uri m8536(Object obj) {
        if (C0064.m9659() < 0) {
            return ((ContentInfo) obj).getLinkUri();
        }
        return null;
    }

    /* renamed from: ۟ۤۦۡۦ, reason: not valid java name and contains not printable characters */
    public static ContentInfo m8537(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((ContentInfo.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۥۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m8538(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((ContentInfo) obj).getFlags();
        }
        return 0;
    }

    /* renamed from: ۡۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ClipData m8539(Object obj) {
        if (C0023.m4566() < 0) {
            return ((ContentInfo) obj).getClip();
        }
        return null;
    }

    /* renamed from: ۥ۟ۤۡ, reason: contains not printable characters */
    public static ContentInfo.Builder m8540(Object obj, int i) {
        if (C0036.m6252() > 0) {
            return ((ContentInfo.Builder) obj).setFlags(i);
        }
        return null;
    }

    /* renamed from: ۥۢۨ۟, reason: contains not printable characters */
    public static ContentInfo.Builder m8541(Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            return ((ContentInfo.Builder) obj).setExtras((Bundle) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۦ, reason: contains not printable characters */
    public static ContentInfo.Builder m8542(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            return ((ContentInfo.Builder) obj).setClip((ClipData) obj2);
        }
        return null;
    }

    /* renamed from: ۥۧۨ۠, reason: contains not printable characters */
    public static Bundle m8543(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((ContentInfo) obj).getExtras();
        }
        return null;
    }

    /* renamed from: ۦ۠۠۟, reason: contains not printable characters */
    public static int m8544(Object obj) {
        if (C0034.m6048() < 0) {
            return ((ContentInfo) obj).getSource();
        }
        return 0;
    }

    /* renamed from: ۣۨۡ۟, reason: not valid java name and contains not printable characters */
    public static TextLinks m8545(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((ClipData.Item) obj).getTextLinks();
        }
        return null;
    }
}