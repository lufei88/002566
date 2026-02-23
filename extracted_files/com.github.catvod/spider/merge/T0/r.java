package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class r implements Cloneable {
    public r a;
    public int b;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f512short = {556, 562, 575, 559, 563, 635, 566, 558, 552, 559, 635, 569, 574, 635, 613, 614, 635, 619, 1078, 1029, 1029, 1046, 1038, 1111, 1050, 1026, 1028, 1027, 1111, 1049, 1048, 1027, 1111, 1044, 1048, 1049, 1027, 1046, 1054, 1049, 1111, 1046, 1049, 1038, 1111, 1049, 1026, 1051, 1051, 1111, 1048, 1045, 1053, 1042, 1044, 1027, 1028, 3133, 3134, 3119, 3174, 2955, 2952, 2969, 3024};
    public static final List c = C0008.m1961();

    public static void m(Appendable appendable, int i, g gVar) {
        String strM8980;
        Appendable appendableM7565 = C0045.m7565(appendable, '\n');
        int iM8969 = i * C0057.m8969(gVar);
        C0003.m1388();
        if (!(iM8969 >= 0)) {
            throw new com.github.catvod.spider.merge.R0.b(C0043.m7290(m5327(), 0, 18, 603));
        }
        int iM8461 = C0053.m8461(gVar);
        C0042.m7163(iM8461 >= -1);
        if (iM8461 != -1) {
            iM8969 = C0051.m8186(iM8969, iM8461);
        }
        if (iM8969 < 21) {
            strM8980 = C0003.m1388()[iM8969];
        } else {
            char[] cArr = new char[iM8969];
            for (int i2 = 0; i2 < iM8969; i2++) {
                cArr[i2] = ' ';
            }
            strM8980 = C0057.m8980(cArr);
        }
        C0024.m4699(appendableM7565, strM8980);
    }

    /* renamed from: ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5327() {
        if (C0045.m7538() <= 0) {
            return f512short;
        }
        return null;
    }

    public String a(String str) {
        URL url;
        C0008.m2009(str);
        boolean zM9337 = C0060.m9337(this);
        String strM1840 = C0007.m1840();
        if (!zM9337 || C0055.m8745(C0017.m3677(this), str) == -1) {
            return strM1840;
        }
        String strM9716 = C0065.m9716(this);
        String strM8334 = C0052.m8334(C0017.m3677(this), str);
        Pattern patternM6196 = C0036.m6196();
        String strM1623 = C0005.m1623(C0034.m6026(patternM6196, strM9716), strM1840);
        String strM16232 = C0005.m1623(C0034.m6026(patternM6196, strM8334), strM1840);
        try {
            try {
                url = C0021.m4354(new URL(strM1623), strM16232);
            } catch (MalformedURLException unused) {
                url = new URL(strM16232);
            }
            strM16232 = C0063.m9526(url);
            return strM16232;
        } catch (MalformedURLException unused2) {
            if (C0003.m1405(C0034.m6026(C0057.m9009(), strM16232))) {
                strM1840 = strM16232;
            }
            return strM1840;
        }
    }

    public final void b(int i, r... rVarArr) {
        C0065.m9779(rVarArr);
        if (rVarArr.length == 0) {
            return;
        }
        List listM9225 = C0059.m9225(this);
        r rVarM1537 = C0004.m1537(rVarArr[0]);
        if (rVarM1537 != null && C0030.m5344(rVarM1537) == rVarArr.length) {
            List listM92252 = C0059.m9225(rVarM1537);
            int length = rVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    boolean z = C0030.m5344(this) == 0;
                    C0044.m7410(rVarM1537);
                    C0025.m4820(listM9225, i, C0001.m1203(rVarArr));
                    int length2 = rVarArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        rVarArr[i3].a = this;
                        length2 = i3;
                    }
                    if (z && C0035.m6143(rVarArr[0]) == 0) {
                        return;
                    }
                    C0057.m9020(this, i);
                    return;
                }
                if (rVarArr[i2] != C0048.m7915(listM92252, i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (r rVar : rVarArr) {
            if (rVar == null) {
                throw new com.github.catvod.spider.merge.R0.b(C0058.m9106(m5327(), 18, 39, 1143));
            }
        }
        for (r rVar2 : rVarArr) {
            C0047.m7777(rVar2);
            r rVarM7395 = C0044.m7395(rVar2);
            if (rVarM7395 != null) {
                C0024.m4715(rVarM7395, rVar2);
            }
            rVar2.a = this;
        }
        C0025.m4820(listM9225, i, C0001.m1203(rVarArr));
        C0057.m9020(this, i);
    }

    public String c(String str) {
        C0065.m9779(str);
        boolean zM9337 = C0060.m9337(this);
        String strM1840 = C0007.m1840();
        if (!zM9337) {
            return strM1840;
        }
        String strM8334 = C0052.m8334(C0017.m3677(this), str);
        return C0004.m1584(strM8334) > 0 ? strM8334 : C0043.m7277(str, C0013.m3106(m5327(), 57, 4, 3164)) ? C0063.m9574(this, C0056.m8890(str, 4)) : strM1840;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return C0004.m1495(this);
    }

    public abstract c d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract int f();

    public r g() {
        r rVarM7434 = C0044.m7434(this, null);
        LinkedList linkedList = new LinkedList();
        C0031.m5644(linkedList, rVarM7434);
        while (!C0019.m4116(linkedList)) {
            r rVar = (r) C0011.m2811(linkedList);
            int iM5344 = C0030.m5344(rVar);
            for (int i = 0; i < iM5344; i++) {
                List listM9225 = C0059.m9225(rVar);
                r rVarM74342 = C0044.m7434((r) C0048.m7915(listM9225, i), rVar);
                C0036.m6193(listM9225, i, rVarM74342);
                C0031.m5644(linkedList, rVarM74342);
            }
        }
        return rVarM7434;
    }

    public r h(r rVar) {
        try {
            r rVar2 = (r) super.clone();
            rVar2.a = rVar;
            rVar2.b = rVar == null ? 0 : C0035.m6143(this);
            if (rVar == null && !(this instanceof h)) {
                r rVarM3163 = C0013.m3163(this);
                h hVar = rVarM3163 instanceof h ? (h) rVarM3163 : null;
                if (hVar != null) {
                    h hVar2 = new h(C0052.m8347(hVar));
                    c cVarM3929 = C0018.m3929(hVar);
                    if (cVarM3929 != null) {
                        hVar2.g = C0007.m1863(cVarM3929);
                    }
                    hVar2.j = C0045.m7654(C0050.m8160(hVar));
                    rVar2.a = hVar2;
                    C0063.m9550(C0002.m1286(hVar2), rVar2);
                }
            }
            return rVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract r i();

    public abstract List j();

    public final boolean k(String str) {
        C0065.m9779(str);
        if (!C0060.m9337(this)) {
            return false;
        }
        if (C0043.m7277(str, C0032.m5708(m5327(), 61, 4, 3050))) {
            String strM8890 = C0056.m8890(str, 4);
            if (C0055.m8745(C0017.m3677(this), strM8890) != -1 && !C0057.m8953(C0063.m9574(this, strM8890))) {
                return true;
            }
        }
        return C0055.m8745(C0017.m3677(this), str) != -1;
    }

    public abstract boolean l();

    public final r n() {
        r rVarM7395 = C0044.m7395(this);
        if (rVarM7395 == null) {
            return null;
        }
        List listM9225 = C0059.m9225(rVarM7395);
        int iM6143 = C0035.m6143(this) + 1;
        if (C0064.m9636(listM9225) > iM6143) {
            return (r) C0048.m7915(listM9225, iM6143);
        }
        return null;
    }

    public abstract String o();

    public String p() {
        StringBuilder sbM8572 = C0054.m8572();
        r rVarM3163 = C0013.m3163(this);
        h hVar = rVarM3163 instanceof h ? (h) rVarM3163 : null;
        if (hVar == null) {
            hVar = new h(C0007.m1840());
        }
        C0006.m1738(new com.github.catvod.spider.merge.E.l(sbM8572, C0050.m8160(hVar)), this);
        return C0004.m1543(sbM8572);
    }

    public abstract void q(Appendable appendable, int i, g gVar);

    public abstract void r(Appendable appendable, int i, g gVar);

    public r s() {
        return C0044.m7395(this);
    }

    public final void t(int i) {
        int iM5344 = C0030.m5344(this);
        if (iM5344 == 0) {
            return;
        }
        List listM9225 = C0059.m9225(this);
        for (int i2 = i; i2 < iM5344; i2++) {
            ((r) C0048.m7915(listM9225, i2)).b = i2;
        }
    }

    public String toString() {
        return C0051.m8204(this);
    }

    public final void u() {
        C0065.m9779(C0044.m7395(this));
        C0024.m4715(C0044.m7395(this), this);
    }

    public void v(r rVar) {
        C0042.m7163(C0044.m7395(rVar) == this);
        int iM6143 = C0035.m6143(rVar);
        C0037.m6314(C0059.m9225(this), iM6143);
        C0057.m9020(this, iM6143);
        rVar.a = null;
    }

    public r w() {
        r rVar = this;
        while (true) {
            r rVarM7395 = C0044.m7395(rVar);
            if (rVarM7395 == null) {
                return rVar;
            }
            rVar = rVarM7395;
        }
    }
}