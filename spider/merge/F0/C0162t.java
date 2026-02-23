package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;

/* renamed from: com.github.catvod.spider.merge.F0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162t extends l0 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f439short = {2244, 2257, 2258, 2248, 2253, 2254, 2255};
    public final int b;

    public C0162t(AbstractC0152i abstractC0152i, int i) {
        super(abstractC0152i);
        this.b = i;
    }

    /* renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m3877() {
        if (C0060.m9355() > 0) {
            return f439short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final int a() {
        return 1;
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
        return C0062.m9389(m3877(), 0, 7, 2209);
    }
}