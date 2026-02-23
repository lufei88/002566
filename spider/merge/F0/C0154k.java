package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* renamed from: com.github.catvod.spider.merge.F0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154k extends l0 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f433short = {823, 821, 802, 831, 825, 824, 777, 476};
    public final int b;
    public final int c;

    public C0154k(AbstractC0152i abstractC0152i, int i, int i2) {
        super(abstractC0152i);
        this.b = i;
        this.c = i2;
    }

    /* renamed from: ۧۤۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m3871() {
        if (C0052.m8320() > 0) {
            return f433short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final int a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0009.m2037(m3871(), 0, 7, 854));
        C0036.m6177(sb, C0044.m7481(this));
        C0018.m3933(sb, C0064.m9599(m3871(), 7, 1, 486));
        C0036.m6177(sb, C0057.m9026(this));
        return C0047.m7763(sb);
    }
}