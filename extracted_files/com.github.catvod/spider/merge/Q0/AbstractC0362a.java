package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0362a implements Iterator {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f847short = {2069, 2090, 2111, 2088, 2107, 2094, 2099, 2101, 2100, 2170, 2099, 2089, 2170, 2100, 2101, 2094, 2170, 2089, 2095, 2090, 2090, 2101, 2088, 2094, 2111, 2110, 2170, 2108, 2101, 2088, 2170, 2088, 2111, 2107, 2110, 2167, 2101, 2100, 2102, 2083, 2170, 2105, 2101, 2102, 2102, 2111, 2105, 2094, 2099, 2101, 2100};

    /* renamed from: ۟ۢۡۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m9165() {
        if (C0023.m4566() <= 0) {
            return f847short;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final Boolean next() {
        return C0028.m5186(C0047.m7845(this));
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return C0028.m5186(C0047.m7845(this));
    }

    public abstract boolean nextBoolean();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(C0043.m7290(m9165(), 0, 51, 2138));
    }
}