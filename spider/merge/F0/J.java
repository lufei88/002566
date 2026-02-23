package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;

/* loaded from: classes.dex */
public final class J extends e0 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f415short = {1784};

    public J(AbstractC0152i abstractC0152i, com.github.catvod.spider.merge.H0.f fVar) {
        super(abstractC0152i, fVar);
    }

    /* renamed from: ۥ۠ۢ۠, reason: contains not printable characters */
    public static short[] m3851() {
        if (C0039.m6529() <= 0) {
            return f415short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.e0, com.github.catvod.spider.merge.F0.l0
    public final int a() {
        return 8;
    }

    @Override // com.github.catvod.spider.merge.F0.e0, com.github.catvod.spider.merge.F0.l0
    public final boolean d(int i, int i2) {
        return i >= 0 && i <= i2 && !C0029.m5281(C0044.m7379(this), i);
    }

    @Override // com.github.catvod.spider.merge.F0.e0
    public final String toString() {
        StringBuilder sb = new StringBuilder(C0035.m6131(m3851(), 0, 1, 1670));
        C0018.m3933(sb, C0045.m7656(C0044.m7379(this)));
        return C0047.m7763(sb);
    }
}