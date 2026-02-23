package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;

/* renamed from: com.github.catvod.spider.merge.F0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156m extends l0 {
    public final int b;

    public C0156m(AbstractC0152i abstractC0152i, int i) {
        super(abstractC0152i);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final com.github.catvod.spider.merge.H0.f c() {
        com.github.catvod.spider.merge.H0.f fVar = new com.github.catvod.spider.merge.H0.f(new int[0]);
        C0065.m9745(fVar, C0001.m1157(this));
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final boolean d(int i, int i2) {
        return C0001.m1157(this) == i;
    }

    public final String toString() {
        return C0054.m8599(C0001.m1157(this));
    }
}