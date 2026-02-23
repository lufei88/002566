package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends ArrayList {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f633short = {2915, 3184, 2529};

    public d() {
    }

    public d(int i) {
        super(i);
    }

    public d(List list) {
        super(list);
    }

    public d(com.github.catvod.spider.merge.T0.m... mVarArr) {
        super(C0001.m1203(mVarArr));
    }

    /* renamed from: ۥۣۤۧ, reason: contains not printable characters */
    public static short[] m5898() {
        if (C0008.m1975() > 0) {
            return f633short;
        }
        return null;
    }

    public final String a(String str) {
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            if (C0019.m4098(mVar, str)) {
                return C0010.m2339(mVar, str);
            }
        }
        return C0007.m1840();
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList(C0009.m2095(this));
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            if (C0019.m4098(mVar, str)) {
                C0004.m1532(arrayList, C0010.m2339(mVar, str));
            }
        }
        return arrayList;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList(C0009.m2095(this));
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            if (C0014.m3303(mVar)) {
                C0004.m1532(arrayList, C0064.m9669(mVar));
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        d dVar = new d(C0009.m2095(this));
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            C0018.m3918(dVar, C0026.m4922((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807)));
        }
        return dVar;
    }

    public final d d(int i) {
        return C0009.m2095(this) > i ? new d((com.github.catvod.spider.merge.T0.m) C0028.m5161(this, i)) : new d();
    }

    public final com.github.catvod.spider.merge.T0.m e() {
        if (C0019.m4116(this)) {
            return null;
        }
        return (com.github.catvod.spider.merge.T0.m) C0028.m5161(this, 0);
    }

    public final String f() {
        StringBuilder sbM8572 = C0054.m8572();
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            if (C0006.m1693(sbM8572) != 0) {
                C0018.m3933(sbM8572, C0048.m7902(m5898(), 0, 1, 2921));
            }
            C0018.m3933(sbM8572, C0000.m1081(mVar));
        }
        return C0004.m1543(sbM8572);
    }

    public final com.github.catvod.spider.merge.T0.m g() {
        if (C0019.m4116(this)) {
            return null;
        }
        return (com.github.catvod.spider.merge.T0.m) C0028.m5161(this, C0009.m2095(this) - 1);
    }

    public final void h() {
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            C0056.m8923((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807));
        }
    }

    public final d i(String str) {
        C0008.m2009(str);
        n nVarM4973 = C0026.m4973(str);
        d dVar = new d();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator itM7816 = C0047.m7816(this);
        while (C0012.m2962(itM7816)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7816);
            C0065.m9779(nVarM4973);
            C0065.m9779(mVar);
            d dVar2 = new d();
            C0006.m1738(new com.github.catvod.spider.merge.U.p(mVar, dVar2, nVarM4973), mVar);
            Iterator itM7807 = C0047.m7807(dVar2);
            while (C0012.m2962(itM7807)) {
                com.github.catvod.spider.merge.T0.m mVar2 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
                if (C0013.m3172(identityHashMap, mVar2, C0000.m1129()) == null) {
                    C0018.m3918(dVar, mVar2);
                }
            }
        }
        return dVar;
    }

    public final String j() {
        StringBuilder sbM8572 = C0054.m8572();
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            if (C0006.m1693(sbM8572) != 0) {
                C0018.m3933(sbM8572, C0016.m3525(m5898(), 1, 1, 3152));
            }
            C0018.m3933(sbM8572, C0064.m9669(mVar));
        }
        return C0004.m1543(sbM8572);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbM8572 = C0054.m8572();
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            if (C0006.m1693(sbM8572) != 0) {
                C0018.m3933(sbM8572, C0058.m9106(m5898(), 2, 1, 2539));
            }
            C0018.m3933(sbM8572, C0051.m8204(mVar));
        }
        return C0004.m1543(sbM8572);
    }
}