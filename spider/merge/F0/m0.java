package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.p.C0057;

/* loaded from: classes.dex */
public final class m0 extends l0 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f437short = {2667};

    public m0(AbstractC0152i abstractC0152i) {
        super(abstractC0152i);
    }

    /* renamed from: ۤ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static short[] m3875() {
        if (C0046.m7701() >= 0) {
            return f437short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final int a() {
        return 9;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final boolean d(int i, int i2) {
        return i >= 0 && i <= i2;
    }

    public final String toString() {
        return C0057.m8978(m3875(), 0, 1, 2629);
    }
}