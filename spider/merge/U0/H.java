package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* loaded from: classes.dex */
public final class H extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f532short = {1746, 1743, 1731, 1731, 3173, 3173, 3190};
    public final StringBuilder b = new StringBuilder();
    public String c;

    public H() {
        this.a = 4;
    }

    /* renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5503() {
        if (C0050.m8121() <= 0) {
            return f532short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.U0.N
    public final void f() {
        C0006.m1785(C0060.m9350(this));
        this.c = null;
    }

    public final void h(char c) {
        String strM5290 = C0029.m5290(this);
        StringBuilder sbM9350 = C0060.m9350(this);
        if (strM5290 != null) {
            C0018.m3933(sbM9350, strM5290);
            this.c = null;
        }
        C0062.m9399(sbM9350, c);
    }

    public final void i(String str) {
        String strM5290 = C0029.m5290(this);
        StringBuilder sbM9350 = C0060.m9350(this);
        if (strM5290 != null) {
            C0018.m3933(sbM9350, strM5290);
            this.c = null;
        }
        if (C0006.m1693(sbM9350) == 0) {
            this.c = str;
        } else {
            C0018.m3933(sbM9350, str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0009.m2037(m5503(), 0, 4, 1774));
        String strM5290 = C0029.m5290(this);
        if (strM5290 == null) {
            strM5290 = C0047.m7763(C0060.m9350(this));
        }
        return C0028.m5188(sb, strM5290, C0042.m7151(m5503(), 4, 3, 3144));
    }
}