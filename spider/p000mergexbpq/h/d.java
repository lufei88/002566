package com.github.catvod.spider.p000mergexbpq.h;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public final class d {
    private final int a;
    private final String b;

    public d() {
        this.a = 500;
        this.b = C0007.m1840();
    }

    public d(int i, String str) {
        this.a = i;
        this.b = str;
    }

    /* renamed from: ۟ۥۣۥۡ, reason: not valid java name and contains not printable characters */
    public static int m2935(Object obj) {
        if (C0049.m8038() < 0) {
            return ((d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۠ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2936(Object obj) {
        if (C0000.m1116() < 0) {
            return ((d) obj).b;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m2936(this)) ? C0007.m1840() : m2936(this);
    }

    public final int b() {
        return m2935(this);
    }
}