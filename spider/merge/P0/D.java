package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* loaded from: classes.dex */
public final class D {
    public final Object[] a;
    public final int b;

    public D(Object... objArr) {
        this.a = objArr;
        this.b = C0012.m2968(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D.class == C0047.m7777(obj)) {
            return C0043.m7330(C0045.m7635(this), C0045.m7635((D) obj));
        }
        return false;
    }

    public final int hashCode() {
        return C0030.m5412(this);
    }
}