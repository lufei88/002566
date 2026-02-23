package com.github.catvod.spider.merge.d;

import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.d.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269d implements Iterator, InterfaceC0270e {
    public C0268c a;
    public boolean b = true;
    public final /* synthetic */ C0266a c;

    public C0269d(C0266a c0266a) {
        this.c = c0266a;
    }

    @Override // com.github.catvod.spider.merge.d.InterfaceC0270e
    public final void a(C0268c c0268c) {
        C0268c c0268cM8256 = C0051.m8256(this);
        if (c0268c == c0268cM8256) {
            C0268c c0268cM9565 = C0063.m9565(c0268cM8256);
            this.a = c0268cM9565;
            this.b = c0268cM9565 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (C0063.m9544(this)) {
            return C0041.m6787(C0001.m1218(this)) != null;
        }
        C0268c c0268cM8256 = C0051.m8256(this);
        return (c0268cM8256 == null || C0052.m8348(c0268cM8256) == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0268c c0268cM8348;
        if (C0063.m9544(this)) {
            this.b = false;
            c0268cM8348 = C0041.m6787(C0001.m1218(this));
        } else {
            C0268c c0268cM8256 = C0051.m8256(this);
            c0268cM8348 = c0268cM8256 != null ? C0052.m8348(c0268cM8256) : null;
        }
        this.a = c0268cM8348;
        return C0051.m8256(this);
    }
}