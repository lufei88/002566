package com.github.catvod.spider.merge.W0;

import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f664short = {1572, 1590, 1585, 1594, 1579, 1590, 1594};
    public final Object a;

    public a(Object obj) {
        this.a = obj;
    }

    /* renamed from: ۣ۟ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6051() {
        if (C0057.m9017() > 0) {
            return f664short;
        }
        return null;
    }

    public final String a() {
        Object objM7637 = C0045.m7637(this);
        if (objM7637 == null) {
            return C0007.m1840();
        }
        if (objM7637 instanceof String) {
            return (String) objM7637;
        }
        if (!(objM7637 instanceof m)) {
            return C0000.m1096(objM7637);
        }
        m mVar = (m) objM7637;
        String strM4326 = C0021.m4326(C0039.m6507(mVar));
        String strM5565 = C0031.m5565(m6051(), 0, 7, 1646);
        return (strM4326 == strM5565 || (strM4326 != null && C0058.m9103(strM4326, strM5565))) ? C0055.m8697(mVar) : C0051.m8204(mVar);
    }

    public final a b(String str) {
        Object objM7637 = C0045.m7637(this);
        LinkedList linkedListM8720 = !(objM7637 instanceof m) ? null : C0055.m8720(new C0163u(new d((m) objM7637)), str);
        if (linkedListM8720 == null || C0036.m6191(linkedListM8720) <= 0) {
            return null;
        }
        return (a) C0034.m6019(linkedListM8720, 0);
    }

    public final String toString() {
        return C0001.m1143(this);
    }
}