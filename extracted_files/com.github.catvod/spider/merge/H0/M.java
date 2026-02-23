package com.github.catvod.spider.merge.h0;

import android.app.AlertDialog;
import android.view.View;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements View.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f808short = {20484, 30368, 1078, 1084, 22497, 28997, 23908, 31425, 32373, 25824, 26728, -30086, 30448, 617, 534, -29762, 31324, -32347, -26888, 25125, -31293, 29729, -28513, 25666, -31836, 29254, 19355, 27344, -29386, 31956, 1540, 1550, 21971, 648, 643, 640, 654, 661, 691, 666, 645, 671, 645, 643, 642, 2660, 2619, 1860, 1858, 1863, 1874, 1861, 916, 917, 923, 916, 3081, 3082, 3090, 22028, -26061, 29840, 17860, -27354, -32678, -27772, 21873, 1696, 403, 404, 396, 414, 26496, 23197, 23008, 19407, 24394};
    public final /* synthetic */ int a;
    public final /* synthetic */ Q b;

    public /* synthetic */ M(Q q, int i) {
        this.a = i;
        this.b = q;
    }

    /* renamed from: ۟ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static short[] m8660() {
        if (C0006.m1726() < 0) {
            return f808short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strM4199 = C0020.m4199(m8660(), 0, 2, 923);
        Q qM1894 = C0007.m1894(this);
        switch (C0048.m7920(this)) {
            case 0:
                C0047.m7777(qM1894);
                ArrayList arrayList = new ArrayList();
                Iterator itM7816 = C0047.m7816(C0057.m9022(qM1894));
                while (C0012.m2962(itM7816)) {
                    C0004.m1532(arrayList, C0033.m5792((O) C0048.m7949(itM7816)));
                }
                StringBuilder sb = new StringBuilder();
                Iterator itM78162 = C0047.m7816(arrayList);
                if (C0012.m2962(itM78162)) {
                    while (true) {
                        C0056.m8896(sb, (CharSequence) C0048.m7949(itM78162));
                        if (C0012.m2962(itM78162)) {
                            C0056.m8896(sb, C0052.m8337(m8660(), 67, 1, 1676));
                        }
                    }
                }
                C0007.m1876(C0047.m7763(sb), C0005.m1645(m8660(), 68, 4, 484));
                try {
                    AlertDialog alertDialogM3660 = C0017.m3660(qM1894);
                    if (alertDialogM3660 != null) {
                        C0004.m1577(alertDialogM3660);
                    }
                } catch (Exception unused) {
                }
                C0038.m6402(C0047.m7833(m8660(), 72, 5, 1042));
                break;
            default:
                ArrayList arrayListM9022 = C0057.m9022(qM1894);
                C0017.m3687(arrayListM9022);
                List listM1203 = C0001.m1203(new String[]{C0051.m8259(m8660(), 2, 7, 1150), strM4199, C0005.m1645(m8660(), 9, 4, 956), C0003.m1398(m8660(), 13, 4, 605), C0018.m3917(m8660(), 17, 5, 3104), C0051.m8259(m8660(), 22, 4, 2631), C0039.m6551(m8660(), 26, 4, 1237)});
                List listM12032 = C0001.m1203(new String[]{C0058.m9106(m8660(), 30, 3, 1612), strM4199, C0031.m5565(m8660(), 33, 12, 748), C0025.m4795(m8660(), 45, 2, 2640), C0044.m7509(m8660(), 47, 5, 1847), C0014.m3332(m8660(), 52, 4, 1020), C0016.m3525(m8660(), 56, 3, 3173)});
                for (int i = 0; i < C0064.m9636(listM12032); i++) {
                    C0004.m1532(arrayListM9022, new O((String) C0048.m7915(listM12032, i), (String) C0048.m7915(listM1203, i)));
                }
                C0008.m1998(qM1894);
                C0008.m1998(qM1894);
                C0038.m6402(C0022.m4403(m8660(), 59, 8, 3070));
                break;
        }
    }
}