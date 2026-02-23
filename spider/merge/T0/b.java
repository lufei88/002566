package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements Iterator {
    public int a = 0;
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        c cVarM9717;
        while (true) {
            int iM9387 = C0062.m9387(this);
            cVarM9717 = C0065.m9717(this);
            if (iM9387 >= C0029.m5233(cVarM9717) || !C0025.m4774(C0022.m4450(cVarM9717)[iM9387])) {
                break;
            }
            this.a = C0062.m9387(this) + 1;
        }
        return C0062.m9387(this) < C0029.m5233(cVarM9717);
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVarM9717 = C0065.m9717(this);
        String[] strArrM4450 = C0022.m4450(cVarM9717);
        int iM9387 = C0062.m9387(this);
        a aVar = new a(strArrM4450[iM9387], (String) C0052.m8318(cVarM9717)[iM9387], cVarM9717);
        this.a = C0062.m9387(this) + 1;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int iM9387 = C0062.m9387(this) - 1;
        this.a = iM9387;
        C0002.m1291(C0065.m9717(this), iM9387);
    }
}