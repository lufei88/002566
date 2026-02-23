package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;

/* loaded from: classes.dex */
public final class P extends AbstractC0153j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f418short = {3303, 3301, 3314, 3315, 3272, 1561};
    public final int b;
    public final int c;
    public final boolean d;

    public P(AbstractC0152i abstractC0152i, int i, int i2, boolean z) {
        super(abstractC0152i);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    /* renamed from: ۣۡۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3855() {
        if (C0031.m5628() > 0) {
            return f418short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final int a() {
        return 4;
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
        StringBuilder sb = new StringBuilder(C0031.m5565(m3855(), 0, 5, 3223));
        C0036.m6177(sb, C0044.m7444(this));
        C0018.m3933(sb, C0038.m6452(m3855(), 5, 1, 1571));
        C0036.m6177(sb, C0021.m4304(this));
        return C0047.m7763(sb);
    }
}