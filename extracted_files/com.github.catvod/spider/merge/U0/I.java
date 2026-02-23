package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* loaded from: classes.dex */
public final class I extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f534short = {2042, 2023, 1954, 1961, 1957, 1970, 1983, 1974, 1955, 2022, 2598};
    public final StringBuilder b = new StringBuilder();
    public String c = null;
    public final StringBuilder d = new StringBuilder();
    public final StringBuilder e = new StringBuilder();
    public boolean f = false;

    public I() {
        this.a = 1;
    }

    /* renamed from: ۟۟ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m5504() {
        if (C0053.m8389() >= 0) {
            return f534short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.U0.N
    public final void f() {
        C0006.m1785(C0020.m4281(this));
        this.c = null;
        C0006.m1785(C0031.m5577(this));
        C0006.m1785(C0009.m2072(this));
        this.f = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0045.m7657(m5504(), 0, 10, 1990));
        C0018.m3933(sb, C0047.m7763(C0020.m4281(this)));
        C0018.m3933(sb, C0046.m7718(m5504(), 10, 1, 2584));
        return C0047.m7763(sb);
    }
}