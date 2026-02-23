package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f201short = {2412, 2422};
    private int a;
    private String b;

    B(int i, String str) {
        this.a = i;
        this.b = str;
    }

    B(int i, String str, Object... objArr) {
        this.b = C0002.m1327(str, objArr);
        this.a = i;
    }

    /* renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2426() {
        if (C0051.m8216() <= 0) {
            return f201short;
        }
        return null;
    }

    /* renamed from: ۟۠ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2427(Object obj) {
        if (C0048.m7971() > 0) {
            return ((B) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m2428(Object obj) {
        if (C0016.m3596() < 0) {
            return ((B) obj).a;
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, m2428(this));
        C0018.m3933(sb, C0037.m6307(m2426(), 0, 2, 2390));
        C0018.m3933(sb, m2427(this));
        return C0047.m7763(sb);
    }
}