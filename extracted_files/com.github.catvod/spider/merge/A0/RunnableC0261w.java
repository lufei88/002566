package com.github.catvod.spider.merge.a0;

import android.R;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.a0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0261w implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f732short = {1701, 1706, 1711, 1699, 1704, 1714, 1689, 1711, 1698, 1075, 1080, 1078, 428, 2199, 2184, 2196, 1631, 1608, 1628, 1624, 1608, 1630, 1625, 1650, 1604, 1609, 685, 689, 689, 693, 694, 767, 746, 746, 688, 682, 693, 747, 692, 688, 676, 695, 686, 747, 678, 683, 746, 678, 676, 694, 746, 676, 687, 676, 701, 746, 674, 672, 689, 657, 682, 686, 672, 683, 643, 682, 695, 660, 695, 678, 682, 673, 672, 649, 682, 674, 684, 683, 2982, 2992, 2977, 3064, 2966, 3002, 3002, 3006, 3004, 2992, 1210, 1487, 1479, 1489, 1489, 1475, 1477, 1479, 437, 433, 2251, 2254, 2267, 2254, 2648, 2640, 2648, 2647, 2640, 2631, 2630, 2738, 2729, 2733, 2723, 2728, -32747, -31631, 23175, 21210, 23209, 3010, 2945, 2957, 2957, 2953, 2955, 2951, 25616, 32378, 25709, -31106, -29816, -30441, 26099, 24888, 24250, -30776, 24803, 26079, 29838, 23968, 725, -30462, 21981, 31818, -28902, 19672, -30389, 32155, 676, 702};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0233B b;

    public /* synthetic */ RunnableC0261w(C0233B c0233b, int i) {
        this.a = i;
        this.b = c0233b;
    }

    /* renamed from: ۟ۡۤۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7101() {
        if (C0045.m7538() < 0) {
            return f732short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0055.m8773(this)) {
            case 0:
                C0233B c0233bM6228 = C0036.m6228(this);
                C0047.m7777(c0233bM6228);
                try {
                    if (C0004.m1510(c0233bM6228)) {
                        C0038.m6402(C0056.m8911(m7101(), 134, 16, 757));
                    } else {
                        int iM3103 = C0013.m3103(16);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                        C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
                        EditText editText = new EditText(C0031.m5652());
                        C0041.m6790(frameLayout, editText, layoutParams);
                        AlertDialog alertDialogM7328 = C0043.m7328(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0025.m4795(m7101(), 114, 12, 3042)), frameLayout), C0000.m1077(m7101(), 126, 8, 1659), new x(c0233bM6228, 0)), R.string.cancel, new x(c0233bM6228, 1)), R.string.ok, new DialogInterfaceOnClickListenerC0227c(c0233bM6228, editText, 3)));
                        c0233bM6228.k = alertDialogM7328;
                        C0025.m4769(alertDialogM7328, new DialogInterfaceOnDismissListenerC0250k(2, c0233bM6228));
                        C0007.m1816(C0017.m3643(c0233bM6228));
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                C0033.m5827(C0036.m6228(this));
                break;
            default:
                C0233B c0233bM62282 = C0036.m6228(this);
                C0047.m7777(c0233bM62282);
                HashMap map = new HashMap();
                C0053.m8424(map, C0050.m8131(m7101(), 0, 9, 1734), C0020.m4199(m7101(), 9, 3, 1024));
                C0053.m8424(map, C0063.m9585(m7101(), 12, 1, 474), C0030.m5362(m7101(), 13, 3, 2214));
                C0053.m8424(map, C0050.m8131(m7101(), 16, 10, 1581), C0026.m4903(C0055.m8713()));
                com.github.catvod.spider.merge.Z.d dVarM1803 = C0007.m1803(C0007.m1842(m7101(), 26, 52, 709), map, new HashMap());
                if (C0057.m8953(C0058.m9117(c0233bM62282))) {
                    List list = (List) C0062.m9431(C0036.m6192(dVarM1803), C0034.m6001(m7101(), 78, 10, 3029));
                    ArrayList arrayList = new ArrayList();
                    Iterator itM3109 = C0013.m3109(list);
                    while (true) {
                        boolean zM2962 = C0012.m2962(itM3109);
                        String strM4199 = C0020.m4199(m7101(), 88, 1, 1153);
                        if (zM2962) {
                            C0004.m1532(arrayList, C0024.m4752((String) C0048.m7949(itM3109), strM4199)[0]);
                        } else {
                            c0233bM62282.a = C0036.m6194(strM4199, arrayList);
                        }
                    }
                }
                Map map2 = (Map) C0029.m5275(C0008.m2029(dVarM1803), Map.class);
                Object objM9431 = C0062.m9431(map2, C0057.m8978(m7101(), 89, 7, 1442));
                String strM41992 = C0020.m4199(m7101(), 96, 2, 474);
                C0016.m3575(new y(c0233bM62282, (objM9431 == strM41992 || (objM9431 != null && C0058.m9103(objM9431, strM41992))) ? (String) C0062.m9431((Map) C0062.m9431((Map) C0062.m9431(map2, C0065.m9775(m7101(), 98, 4, 2223)), C0050.m8131(m7101(), 102, 7, 2613)), C0057.m8978(m7101(), 109, 5, 2758)) : C0007.m1840(), 1));
                break;
        }
    }
}