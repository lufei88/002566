package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f implements Iterator {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f852short = {2526, 2529, 2548, 2531, 2544, 2533, 2552, 2558, 2559, 2481, 2552, 2530, 2481, 2559, 2558, 2533, 2481, 2530, 2532, 2529, 2529, 2558, 2531, 2533, 2548, 2549, 2481, 2551, 2558, 2531, 2481, 2531, 2548, 2544, 2549, 2492, 2558, 2559, 2557, 2536, 2481, 2546, 2558, 2557, 2557, 2548, 2546, 2533, 2552, 2558, 2559};

    /* renamed from: ۦۣۣۢ, reason: contains not printable characters */
    public static short[] m9170() {
        if (C0031.m5628() > 0) {
            return f852short;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return C0011.m2808(C0060.m9298(this));
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return C0011.m2808(C0060.m9298(this));
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(C0016.m3525(m9170(), 0, 51, 2449));
    }
}