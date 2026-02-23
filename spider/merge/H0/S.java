package com.github.catvod.spider.merge.h0;

import android.app.AlertDialog;
import android.view.View;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class S implements View.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f810short = {32249, 21793, 22668, 20735, 1119, 1097, 24322, 31191, 1233, 1234, 1235, -29504, -27150, 3286, 3285, 3293, 3280, 3265, 933, 929, 949, 934, 959, 1074, 1060, 1087, 1056, 1075, 1144, 1059, 1077, 618, 613, 614, 636, 621, 551, 568, 561, 560, 464, 464, 464, 393, 406, 405, 404, 2206, 2195, 2184, 2186, 2179, 2191, 21942, -26231, 30506, 18046, -26980, -31776, -28610, 22219, 3018, 824, 831, 831, 823, 26772, 21897, 22260, 17627, 20574};
    public final /* synthetic */ int a;
    public final /* synthetic */ Q b;

    public /* synthetic */ S(Q q, int i) {
        this.a = i;
        this.b = q;
    }

    /* renamed from: ۠ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8662() {
        if (C0007.m1886() >= 0) {
            return f810short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Q qM4405 = C0022.m4405(this);
        switch (C0045.m7541(this)) {
            case 0:
                C0047.m7777(qM4405);
                ArrayList arrayList = new ArrayList();
                Iterator itM7816 = C0047.m7816(C0057.m9022(qM4405));
                while (C0012.m2962(itM7816)) {
                    C0004.m1532(arrayList, C0017.m3701((T) C0048.m7949(itM7816)));
                }
                StringBuilder sb = new StringBuilder();
                Iterator itM78162 = C0047.m7816(arrayList);
                if (C0012.m2962(itM78162)) {
                    while (true) {
                        C0056.m8896(sb, (CharSequence) C0048.m7949(itM78162));
                        if (C0012.m2962(itM78162)) {
                            C0056.m8896(sb, C0062.m9389(m8662(), 61, 1, 3046));
                        }
                    }
                }
                C0007.m1876(C0047.m7763(sb), C0043.m7290(m8662(), 62, 4, 847));
                try {
                    AlertDialog alertDialogM3660 = C0017.m3660(qM4405);
                    if (alertDialogM3660 != null) {
                        C0004.m1577(alertDialogM3660);
                    }
                } catch (Exception unused) {
                }
                C0038.m6402(C0045.m7657(m8662(), 66, 5, 2822));
                break;
            default:
                ArrayList arrayListM9022 = C0057.m9022(qM4405);
                C0017.m3687(arrayListM9022);
                List listM1203 = C0001.m1203(new String[]{C0031.m5565(m8662(), 0, 2, 2951), C0003.m1398(m8662(), 2, 2, 436), C0057.m8978(m8662(), 4, 2, 1034), C0020.m4199(m8662(), 6, 2, 1579), C0023.m4536(m8662(), 8, 3, 1248), C0048.m7902(m8662(), 11, 2, 773)});
                List listM12032 = C0001.m1203(new String[]{C0054.m8574(m8662(), 13, 5, 3252), C0014.m3332(m8662(), 18, 5, 980), C0062.m9389(m8662(), 23, 8, 1110), C0030.m5362(m8662(), 31, 9, 521), C0053.m8477(m8662(), 40, 7, 423), C0061.m9361(m8662(), 47, 6, 2278)});
                for (int i = 0; i < C0064.m9636(listM12032); i++) {
                    C0004.m1532(arrayListM9022, new T((String) C0048.m7915(listM12032, i), (String) C0048.m7915(listM1203, i)));
                }
                C0008.m1998(qM4405);
                C0008.m1998(qM4405);
                C0038.m6402(C0001.m1189(m8662(), 53, 8, 2116));
                break;
        }
    }
}