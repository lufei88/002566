package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final class O extends AbstractC0153j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f417short = {2913, 2943, 2940, 2913, 2846, 2865};
    public final int b;

    public O(AbstractC0152i abstractC0152i, int i) {
        super(abstractC0152i);
        this.b = i;
    }

    /* renamed from: ۣ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static short[] m3854() {
        if (C0043.m7332() >= 0) {
            return f417short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final int a() {
        return 10;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, C0013.m3177(this));
        C0018.m3933(sb, C0014.m3332(m3854(), 0, 6, 2881));
        return C0047.m7763(sb);
    }
}