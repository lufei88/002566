package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d0 {
    public static final c0 a = new c0();

    public static List a(HashSet hashSet) {
        Iterator itM2019 = C0008.m2019(hashSet);
        ArrayList arrayList = null;
        while (C0012.m2962(itM2019)) {
            d0 d0Var = (d0) C0048.m7949(itM2019);
            if (d0Var instanceof b0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C0004.m1532(arrayList, (b0) d0Var);
                C0005.m1641(itM2019);
            }
        }
        return arrayList == null ? C0008.m1961() : arrayList;
    }

    public static d0 b(d0 d0Var, d0 d0Var2) {
        c0 c0VarM9087;
        if (d0Var == null || d0Var == (c0VarM9087 = C0058.m9087())) {
            return d0Var2;
        }
        if (d0Var2 == null || d0Var2 == c0VarM9087) {
            return d0Var;
        }
        Y y = new Y(d0Var, d0Var2);
        d0[] d0VarArrM1468 = C0003.m1468(y);
        return d0VarArrM1468.length == 1 ? d0VarArrM1468[0] : y;
    }

    public abstract boolean c(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar);

    public d0 d(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar) {
        return this;
    }
}