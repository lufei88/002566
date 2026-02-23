package com.github.catvod.spider.merge.W;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.HBhaiM;
import com.github.catvod.spider.HBleiJing;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.J;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0235D;
import com.github.catvod.spider.merge.a0.RunnableC0241b;
import com.github.catvod.spider.merge.a0.RunnableC0249j;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.W.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0227c implements DialogInterface.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f651short = {737, 24257, -31616, 26463, 737, 698, 678, 683, 675, 683, 736, 678, 698, 675, 674, 542, 543, 525, 614, 627, 2281, 2286, 2240, 2286, 2268, 2286, 2241, 2287, 2201, 2198, 478, 475, 475, 492, 458, 463, 463, 461, 474, 460, 460, 474, 475, 2137, 2131, 2117, 2119, 2110, 2111, 2173, 2164, 2168, 2171, 2168, 2175, 2166, 2162, 2170, 1263, 1253, 1267, 1265, 1160, 1161, 1231, 1222, 1230, 1226, 1230, 1222, 1225, 1220, 1228, -26081, 17467, -28022, -30620, 2604, 2614, 2613, 2611, 2598, 2596, 2638, 2611, 2598, 2596, 2638, 2611, 2598, 2596, 2638, 2611, 2680};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0227c(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* renamed from: ۥۧۤۢ, reason: contains not printable characters */
    public static short[] m5916() {
        if (C0063.m9589() < 0) {
            return f651short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 1;
        int i3 = 0;
        Object objM5004 = C0027.m5004(this);
        Object objM3147 = C0013.m3147(this);
        switch (C0028.m5129(this)) {
            case 0:
                List list = (List) objM5004;
                h hVar = (h) objM3147;
                ArrayList arrayListM9406 = C0062.m9406(hVar);
                AlertDialog alertDialog = (AlertDialog) C0020.m4247(hVar);
                if (alertDialog != null) {
                    C0004.m1577(alertDialog);
                }
                ArrayList arrayList = new ArrayList();
                Iterator itM7816 = C0047.m7816(arrayListM9406);
                while (C0012.m2962(itM7816)) {
                    Integer num = (Integer) C0048.m7949(itM7816);
                    int iM4690 = C0024.m4690(num);
                    C0015.m3428(C0035.m6087(), C0013.m3106(m5916(), 73, 21, 2582), new Object[]{C0011.m2808(C0011.m2751(iM4690)), C0011.m2808(C0064.m9616(iM4690)), C0011.m2808(C0019.m4034(iM4690))});
                    C0004.m1532(arrayList, num);
                }
                try {
                    C0005.m1648();
                    C0001.m1230((ArrayList) list);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            case 1:
                C0246g c0246g = (C0246g) objM3147;
                C0047.m7777(c0246g);
                String strM6312 = C0037.m6312(C0065.m9797((EditText) objM5004));
                C0054.m8579(c0246g);
                C0025.m4829(new RunnableC0241b(c0246g, strM6312, i2));
                return;
            case 2:
                C0254o c0254o = (C0254o) objM3147;
                C0047.m7777(c0254o);
                String strM63122 = C0037.m6312(C0065.m9797((EditText) objM5004));
                C0056.m8936(c0254o);
                C0025.m4829(new RunnableC0249j(c0254o, strM63122, i3));
                return;
            case 3:
                C0233B c0233b = (C0233B) objM3147;
                C0047.m7777(c0233b);
                String strM63123 = C0037.m6312(C0065.m9797((EditText) objM5004));
                C0033.m5827(c0233b);
                C0025.m4829(new com.github.catvod.spider.merge.a0.y(c0233b, strM63123, i3));
                return;
            case 4:
                C0246g c0246g2 = (C0246g) objM3147;
                C0047.m7777(c0246g2);
                String strM63124 = C0037.m6312(C0065.m9797((EditText) objM5004));
                C0054.m8579(c0246g2);
                C0025.m4829(new RunnableC0235D(c0246g2, strM63124, i3));
                return;
            case 5:
                M m = (M) objM3147;
                C0047.m7777(m);
                String strM63125 = C0037.m6312(C0065.m9797((EditText) objM5004));
                C0031.m5581(m);
                C0025.m4829(new J(m, strM63125, i3));
                return;
            case 6:
                HBhaiM hBhaiM = (HBhaiM) objM3147;
                C0047.m7777(hBhaiM);
                String strM63126 = C0037.m6312(C0065.m9797((EditText) objM5004));
                try {
                    AlertDialog alertDialogM7375 = C0043.m7375(hBhaiM);
                    if (alertDialogM7375 != null) {
                        C0004.m1577(alertDialogM7375);
                    }
                } catch (Exception unused) {
                }
                C0034.m5994(strM63126, C0042.m7151(m5916(), 58, 15, 1191));
                return;
            case 7:
                HBleiJing hBleiJing = (HBleiJing) objM3147;
                C0047.m7777(hBleiJing);
                String strM63127 = C0037.m6312(C0065.m9797((EditText) objM5004));
                try {
                    AlertDialog alertDialogM6826 = C0041.m6826(hBleiJing);
                    if (alertDialogM6826 != null) {
                        C0004.m1577(alertDialogM6826);
                    }
                } catch (Exception unused2) {
                }
                C0034.m5994(strM63127, C0022.m4403(m5916(), 43, 15, 2065));
                return;
            default:
                S s = (S) objM3147;
                C0047.m7777(s);
                String strM9640 = C0064.m9640(C0037.m6312(C0065.m9797((EditText) objM5004)));
                File file = new File(C0049.m7985(), C0057.m8978(m5916(), 0, 15, 718));
                if (C0028.m5187(C0029.m5255(file)) || C0045.m7616(C0029.m5255(file))) {
                    try {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), C0055.m8706(C0028.m5109(m5916(), 15, 5, 587)));
                        if (strM9640 != null) {
                            try {
                                strM9640 = C0025.m4800(strM9640, C0046.m7718(m5916(), 20, 10, 2226), C0007.m1840());
                            } catch (Throwable th) {
                                try {
                                    C0038.m6429(outputStreamWriter);
                                } catch (Throwable th2) {
                                    try {
                                        C0052.m8352(C0057.m8970(Throwable.class, C0023.m4536(m5916(), 30, 13, 447), new Class[]{Throwable.class}), th, new Object[]{th2});
                                    } catch (Exception unused3) {
                                    }
                                }
                                throw th;
                            }
                        }
                        C0006.m1740(outputStreamWriter, strM9640);
                        C0038.m6429(outputStreamWriter);
                    } catch (IOException unused4) {
                    }
                }
                C0015.m3438(s);
                C0051.m8252(s);
                return;
        }
    }
}