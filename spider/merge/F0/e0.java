package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.z.C0065;

/* loaded from: classes.dex */
public class e0 extends l0 {
    public final com.github.catvod.spider.merge.H0.f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(AbstractC0152i abstractC0152i, com.github.catvod.spider.merge.H0.f fVar) {
        super(abstractC0152i);
        com.github.catvod.spider.merge.H0.f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new com.github.catvod.spider.merge.H0.f(new int[0]);
            C0065.m9745(fVar2, 0);
        }
        this.b = fVar2;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final com.github.catvod.spider.merge.H0.f c() {
        return C0044.m7379(this);
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public boolean d(int i, int i2) {
        return C0029.m5281(C0044.m7379(this), i);
    }

    public String toString() {
        return C0045.m7656(C0044.m7379(this));
    }
}