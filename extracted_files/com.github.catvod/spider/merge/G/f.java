package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.thegrizzlylabs.sardineandroid.DavResource;
import java.util.Comparator;
import java.util.Date;

/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f445short = {1335, 1325, 1342, 1313, 1788, 1779, 1791, 1783, 1041, 1044, 1025, 1040, 1851, 1833, 1849};
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ f(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    /* renamed from: ۟ۧۥۤ۠, reason: not valid java name and contains not printable characters */
    public static Date m4018(Object obj) {
        if (C0000.m1116() < 0) {
            return ((DavResource) obj).getModified();
        }
        return null;
    }

    /* renamed from: ۣۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4019(Object obj) {
        if (C0038.m6471() > 0) {
            return ((DavResource) obj).getName();
        }
        return null;
    }

    /* renamed from: ۤۦۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m4020() {
        if (C0015.m3433() > 0) {
            return f445short;
        }
        return null;
    }

    /* renamed from: ۥ۠ۡۦ, reason: contains not printable characters */
    public static Long m4021(Object obj) {
        if (C0027.m5017() > 0) {
            return ((DavResource) obj).getContentLength();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0077  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r63, java.lang.Object r64) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.G.f.compare(java.lang.Object, java.lang.Object):int");
    }
}