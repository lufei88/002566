package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.y0.C0064;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {
    public final Object[] a;
    public int b = 0;
    public boolean c = true;
    public final /* synthetic */ C0147d d;

    public a(C0147d c0147d, Object[] objArr) {
        this.d = c0147d;
        this.a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C0064.m9662(this) < C0064.m9693(this).length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!C0054.m8552(this)) {
            throw new NoSuchElementException();
        }
        this.c = false;
        int iM9662 = C0064.m9662(this);
        this.b = iM9662 + 1;
        return C0064.m9693(this)[iM9662];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (C0055.m8746(this)) {
            throw new IllegalStateException();
        }
        C0024.m4694(C0044.m7502(this), C0064.m9693(this)[C0064.m9662(this) - 1]);
        this.c = true;
    }
}