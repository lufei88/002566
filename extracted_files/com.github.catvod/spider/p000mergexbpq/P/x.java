package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.T.b;
import com.github.catvod.spider.p000mergexbpq.T.c;
import com.github.catvod.spider.p000mergexbpq.T.f;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class x extends C {
    public List<b> d;
    public D e;
    public D f;

    public x() {
    }

    public x(x xVar, int i) {
        super(xVar, i);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.P.C, com.github.catvod.spider.p000mergexbpq.T.b
    public final b b(int i) {
        ArrayList arrayListM3975 = C0018.m3975(this);
        if (arrayListM3975 == null || i < 0 || i >= C0009.m2139(arrayListM3975)) {
            return null;
        }
        return (b) C0028.m5167(C0018.m3975(this), i);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.P.C, com.github.catvod.spider.p000mergexbpq.T.b
    public final int d() {
        ArrayList arrayListM3975 = C0018.m3975(this);
        if (arrayListM3975 != null) {
            return C0009.m2139(arrayListM3975);
        }
        return 0;
    }

    public final <T extends b> T h(T t) {
        if (C0018.m3975(this) == null) {
            this.d = new ArrayList();
        }
        C0004.m1532(C0018.m3975(this), t);
        return t;
    }

    public void i(c cVar) {
    }

    public void j(c cVar) {
    }

    public final x k(Class cls) {
        b bVar;
        ArrayList arrayListM3975 = C0018.m3975(this);
        if (arrayListM3975 == null || C0009.m2139(arrayListM3975) <= 0) {
            bVar = null;
        } else {
            Iterator itM7816 = C0047.m7816(C0018.m3975(this));
            while (C0012.m2962(itM7816)) {
                b bVar2 = (b) C0048.m7949(itM7816);
                if (C0012.m2993(cls, bVar2)) {
                    bVar = (b) C0063.m9548(cls, bVar2);
                    break;
                }
            }
            bVar = null;
        }
        return (x) bVar;
    }

    public final <T extends x> List<T> l(Class<? extends T> cls) {
        ArrayList arrayListM3975 = C0018.m3975(this);
        if (arrayListM3975 == null) {
            return C0008.m1961();
        }
        ArrayList arrayList = null;
        Iterator itM7816 = C0047.m7816(arrayListM3975);
        while (C0012.m2962(itM7816)) {
            b bVar = (b) C0048.m7949(itM7816);
            if (C0012.m2993(cls, bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C0063.m9550(arrayList, C0063.m9548(cls, bVar));
            }
        }
        return arrayList == null ? C0008.m1961() : arrayList;
    }

    public final f m(int i) {
        ArrayList arrayListM3975 = C0018.m3975(this);
        if (arrayListM3975 == null || C0009.m2139(arrayListM3975) <= 0) {
            return null;
        }
        Iterator itM7816 = C0047.m7816(C0018.m3975(this));
        while (C0012.m2962(itM7816)) {
            b bVar = (b) C0048.m7949(itM7816);
            if (bVar instanceof f) {
                f fVar = (f) bVar;
                if (C0011.m2787(C0027.m5064(fVar)) == i) {
                    return fVar;
                }
            }
        }
        return null;
    }
}