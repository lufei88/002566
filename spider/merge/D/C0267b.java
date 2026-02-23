package com.github.catvod.spider.merge.d;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267b implements Iterator, InterfaceC0270e {
    public C0268c a;
    public C0268c b;
    public final /* synthetic */ int c;

    public C0267b(C0268c c0268c, C0268c c0268c2, int i) {
        this.c = i;
        this.a = c0268c2;
        this.b = c0268c;
    }

    @Override // com.github.catvod.spider.merge.d.InterfaceC0270e
    public final void a(C0268c c0268c) {
        C0268c c0268cM5076 = null;
        if (C0052.m8376(this) == c0268c && c0268c == C0000.m1054(this)) {
            this.b = null;
            this.a = null;
        }
        C0268c c0268cM8376 = C0052.m8376(this);
        if (c0268cM8376 == c0268c) {
            this.a = C0063.m9564(this, c0268cM8376);
        }
        C0268c c0268cM1054 = C0000.m1054(this);
        if (c0268cM1054 == c0268c) {
            C0268c c0268cM83762 = C0052.m8376(this);
            if (c0268cM1054 != c0268cM83762 && c0268cM83762 != null) {
                c0268cM5076 = C0027.m5076(this, c0268cM1054);
            }
            this.b = c0268cM5076;
        }
    }

    public final C0268c b(C0268c c0268c) {
        switch (C0037.m6384(this)) {
            case 0:
                return C0063.m9565(c0268c);
            default:
                return C0052.m8348(c0268c);
        }
    }

    public final C0268c c(C0268c c0268c) {
        switch (C0037.m6384(this)) {
            case 0:
                return C0052.m8348(c0268c);
            default:
                return C0063.m9565(c0268c);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C0000.m1054(this) != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0268c c0268cM1054 = C0000.m1054(this);
        C0268c c0268cM8376 = C0052.m8376(this);
        this.b = (c0268cM1054 == c0268cM8376 || c0268cM8376 == null) ? null : C0027.m5076(this, c0268cM1054);
        return c0268cM1054;
    }
}