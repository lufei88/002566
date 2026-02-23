package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0412b implements Iterable {
    public final int a;
    public final int b;
    public final int c;

    public AbstractC0412b(int i, int i2) {
        int i3 = i2;
        this.a = i;
        if (i < i3) {
            int i4 = i3 % 1;
            int i5 = i % 1;
            int i6 = ((i4 < 0 ? i4 + 1 : i4) - (i5 < 0 ? i5 + 1 : i5)) % 1;
            i3 -= i6 < 0 ? i6 + 1 : i6;
        }
        this.b = i3;
        this.c = 1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0413c(C0003.m1470(this), C0035.m6134(this), C0030.m5396(this));
    }
}