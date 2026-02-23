package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g implements Iterator {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f853short = {513, 574, 555, 572, 559, 570, 551, 545, 544, 622, 551, 573, 622, 544, 545, 570, 622, 573, 571, 574, 574, 545, 572, 570, 555, 554, 622, 552, 545, 572, 622, 572, 555, 559, 554, 611, 545, 544, 546, 567, 622, 557, 545, 546, 546, 555, 557, 570, 551, 545, 544};

    /* renamed from: ۟ۥۣۦۥ, reason: not valid java name and contains not printable characters */
    public static short[] m9171() {
        if (C0017.m3633() < 0) {
            return f853short;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final Long next() {
        return C0004.m1568(C0058.m9068(this));
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return C0004.m1568(C0058.m9068(this));
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(C0052.m8337(m9171(), 0, 51, 590));
    }
}