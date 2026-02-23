package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.github.catvod.spider.merge.e.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277g implements Iterator {
    public final int a;
    public int b;
    public int c;
    public boolean d = false;
    public final /* synthetic */ C0271a e;

    public C0277g(C0271a c0271a, int i) {
        this.e = c0271a;
        this.a = i;
        this.b = C0022.m4406(c0271a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C0033.m5885(this) < C0009.m2119(this);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!C0036.m6233(this)) {
            throw new NoSuchElementException();
        }
        Object objM6793 = C0041.m6793(C0013.m3091(this), C0033.m5885(this), C0000.m1043(this));
        this.c = C0033.m5885(this) + 1;
        this.d = true;
        return objM6793;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!C0064.m9617(this)) {
            throw new IllegalStateException();
        }
        int iM5885 = C0033.m5885(this) - 1;
        this.c = iM5885;
        this.b = C0009.m2119(this) - 1;
        this.d = false;
        C0047.m7836(C0013.m3091(this), iM5885);
    }
}