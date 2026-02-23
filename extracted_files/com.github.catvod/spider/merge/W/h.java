package com.github.catvod.spider.merge.W;

import android.R;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f652short = {2003, 1996, 2003, 1996, 2000, 3075, 3081, 3119, 3114, 3109, 3110, 3134, 1574, 1571, 1580, 1583, 1591, 1595, 1585, 1729, -28960, 31280, 26446, 22465, 2250, 2255, 2255, 2296, 2270, 2267, 2267, 2265, 2254, 2264, 2264, 2254, 2255, -26248, -31850, 452, 553, 1783, 2181, 1652, 1649, 1662, 1661, 1637, 1641, 1635, 3259, 1919, 1914, 1914, 1869, 1899, 1902, 1902, 1900, 1915, 1901, 1901, 1915, 1914};
    public final ArrayList a;
    public Object b;
    public Object c;
    public Serializable d;
    public Serializable e;

    public h(int i) {
        switch (i) {
            case 1:
                String strM1840 = C0007.m1840();
                this.b = strM1840;
                this.c = strM1840;
                this.d = strM1840;
                this.e = C0021.m4340(m5917(), 0, 5, 2018);
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                C0050.m8082();
                break;
        }
    }

    public static void c() {
        try {
            C0019.m4117(new File(C0003.m1375(C0022.m4453()), C0017.m3646(m5917(), 5, 7, 3147)));
        } catch (Exception unused) {
        }
    }

    public static void f(ArrayList arrayList) {
        String strM1549;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(C0003.m1375(C0022.m4453()), C0023.m4536(m5917(), 12, 7, 1602))));
            try {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                boolean z = true;
                while (true) {
                    int iM2139 = C0009.m2139(arrayList);
                    strM1549 = C0004.m1549(m5917(), 19, 1, 1773);
                    if (i >= iM2139) {
                        break;
                    }
                    if (C0031.m5606(C0058.m9151((f) C0028.m5167(arrayList, i)))) {
                        if (!z) {
                            C0018.m3933(sb, strM1549);
                        }
                        int iM8134 = C0050.m8134((ColorDrawable) C0059.m9251(C0002.m1320((f) C0028.m5167(arrayList, i))));
                        C0036.m6177(sb, C0019.m4034(iM8134) | (C0011.m2751(iM8134) << 16) | (C0064.m9616(iM8134) << 8));
                        z = false;
                    }
                    i++;
                }
                C0006.m1740(bufferedWriter, C0047.m7763(sb));
                C0056.m8895(bufferedWriter);
                StringBuilder sb2 = new StringBuilder();
                int i2 = 0;
                while (i2 < 7) {
                    if (i2 > 0) {
                        C0018.m3933(sb2, strM1549);
                    }
                    C0006.m1736(sb2, i2 < C0009.m2139(arrayList) ? C0031.m5606(C0058.m9151((f) C0028.m5167(arrayList, i2))) : false);
                    i2++;
                }
                C0006.m1740(bufferedWriter, C0047.m7763(sb2));
                C0056.m8895(bufferedWriter);
                StringBuilder sb3 = new StringBuilder();
                int i3 = 0;
                while (i3 < 7) {
                    if (i3 > 0) {
                        C0018.m3933(sb3, strM1549);
                    }
                    int iM81342 = i3 < C0009.m2139(arrayList) ? C0050.m8134((ColorDrawable) C0059.m9251(C0002.m1320((f) C0028.m5167(arrayList, i3)))) : -16777216;
                    C0036.m6177(sb3, C0019.m4034(iM81342) | (C0011.m2751(iM81342) << 16) | (C0064.m9616(iM81342) << 8));
                    i3++;
                }
                C0006.m1740(bufferedWriter, C0047.m7763(sb3));
                C0038.m6402(C0038.m6452(m5917(), 20, 4, 1374));
                C0020.m4267(bufferedWriter);
            } catch (Throwable th) {
                try {
                    C0020.m4267(bufferedWriter);
                } catch (Throwable th2) {
                    try {
                        C0052.m8352(C0057.m8970(Throwable.class, C0046.m7718(m5917(), 24, 13, 2219), new Class[]{Throwable.class}), th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            C0049.m7975(e);
        }
    }

    /* renamed from: ۣ۟۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5917() {
        if (C0006.m1726() <= 0) {
            return f652short;
        }
        return null;
    }

    public f a(int i, int i2, int i3) {
        LinearLayout linearLayout = new LinearLayout((Activity) C0024.m4735(this));
        C0032.m5684(linearLayout, 0);
        C0014.m3381(linearLayout, 16);
        C0016.m3608(linearLayout, 0, i2, 0, i2);
        CheckBox checkBox = new CheckBox((Activity) C0024.m4735(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        C0012.m2963(layoutParams, 0, 0, i2, 0);
        C0041.m6790(linearLayout, checkBox, layoutParams);
        TextView textView = new TextView((Activity) C0024.m4735(this));
        StringBuilder sb = new StringBuilder(C0053.m8477(m5917(), 37, 3, 484));
        C0036.m6177(sb, i3 + 1);
        C0042.m7106(textView, C0047.m7763(sb));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        C0012.m2963(layoutParams2, 0, 0, i2, 0);
        C0041.m6790(linearLayout, textView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout((Activity) C0024.m4735(this));
        C0032.m5684(linearLayout2, 1);
        C0009.m2112(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        SeekBar seekBar = new SeekBar((Activity) C0024.m4735(this));
        C0034.m6041(seekBar, 255);
        SeekBar seekBar2 = new SeekBar((Activity) C0024.m4735(this));
        C0034.m6041(seekBar2, 255);
        SeekBar seekBar3 = new SeekBar((Activity) C0024.m4735(this));
        C0034.m6041(seekBar3, 255);
        C0037.m6336(linearLayout2, C0033.m5888(this, C0000.m1077(m5917(), 40, 1, 635), seekBar, i2));
        C0037.m6336(linearLayout2, C0033.m5888(this, C0039.m6551(m5917(), 41, 1, 1712), seekBar2, i2));
        C0037.m6336(linearLayout2, C0033.m5888(this, C0053.m8477(m5917(), 42, 1, 2247), seekBar3, i2));
        C0037.m6336(linearLayout, linearLayout2);
        View view = new View((Activity) C0024.m4735(this));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i, i);
        C0012.m2963(layoutParams3, i2, 0, 0, 0);
        C0026.m4916(view, R.drawable.dialog_holo_dark_frame);
        C0009.m2112(view, layoutParams3);
        ArrayList arrayList = (ArrayList) C0046.m7731(this);
        int iM4690 = i3 < C0009.m2139(arrayList) ? C0024.m4690((Integer) C0028.m5167(arrayList, i3)) : -16777216;
        C0048.m7907(view, iM4690);
        int iM2751 = C0011.m2751(iM4690);
        int iM9616 = C0064.m9616(iM4690);
        int iM4034 = C0019.m4034(iM4690);
        C0039.m6520(seekBar, iM2751);
        C0039.m6520(seekBar2, iM9616);
        C0039.m6520(seekBar3, iM4034);
        C0037.m6336(linearLayout, view);
        C0228d c0228d = new C0228d(this, seekBar, seekBar2, seekBar3, view, checkBox, i3);
        C0000.m1091(seekBar, c0228d);
        C0000.m1091(seekBar2, c0228d);
        C0000.m1091(seekBar3, c0228d);
        C0042.m7186(checkBox, new C0229e(this, seekBar, seekBar2, seekBar3, i3));
        ArrayList arrayList2 = (ArrayList) C0062.m9424(this);
        if (i3 < C0009.m2139(arrayList2)) {
            C0050.m8106(checkBox, C0010.m2318((Boolean) C0028.m5167(arrayList2, i3)));
        }
        C0044.m7378(seekBar, C0031.m5606(checkBox));
        C0044.m7378(seekBar2, C0031.m5606(checkBox));
        C0044.m7378(seekBar3, C0031.m5606(checkBox));
        f fVar = new f();
        fVar.a = linearLayout;
        fVar.b = checkBox;
        fVar.c = view;
        return fVar;
    }

    public LinearLayout b(String str, SeekBar seekBar, int i) {
        LinearLayout linearLayout = new LinearLayout((Activity) C0024.m4735(this));
        C0032.m5684(linearLayout, 0);
        C0014.m3381(linearLayout, 16);
        TextView textView = new TextView((Activity) C0024.m4735(this));
        C0042.m7106(textView, str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        C0012.m2963(layoutParams, 0, 0, i, 0);
        C0041.m6790(linearLayout, textView, layoutParams);
        C0041.m6790(linearLayout, seekBar, new LinearLayout.LayoutParams(0, -2, 1.0f));
        return linearLayout;
    }

    public void d() {
        File file = new File(C0003.m1375(C0022.m4453()), C0000.m1077(m5917(), 43, 7, 1552));
        if (C0028.m5187(file)) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                ArrayList arrayListM9406 = C0062.m9406(this);
                try {
                    C0017.m3687(arrayListM9406);
                    ArrayList arrayList = (ArrayList) C0062.m9424(this);
                    C0017.m3687(arrayList);
                    ArrayList arrayList2 = (ArrayList) C0046.m7731(this);
                    C0017.m3687(arrayList2);
                    String strM4438 = C0022.m4438(bufferedReader);
                    String strM4795 = C0025.m4795(m5917(), 50, 1, 3223);
                    if (strM4438 != null) {
                        for (String str : C0024.m4752(strM4438, strM4795)) {
                            if (!C0057.m8953(str)) {
                                int iM6456 = C0038.m6456(str);
                                C0004.m1532(arrayListM9406, C0011.m2808(C0042.m7113(255, (iM6456 >> 16) & 255, (iM6456 >> 8) & 255, iM6456 & 255)));
                            }
                        }
                    }
                    String strM44382 = C0022.m4438(bufferedReader);
                    if (strM44382 != null) {
                        String[] strArrM4752 = C0024.m4752(strM44382, strM4795);
                        for (int i = 0; i < 7 && i < strArrM4752.length; i++) {
                            C0004.m1532(arrayList, C0028.m5186(C0020.m4197(strArrM4752[i])));
                        }
                    }
                    String strM44383 = C0022.m4438(bufferedReader);
                    if (strM44383 != null) {
                        String[] strArrM47522 = C0024.m4752(strM44383, strM4795);
                        for (int i2 = 0; i2 < 7 && i2 < strArrM47522.length; i2++) {
                            int iM64562 = C0038.m6456(strArrM47522[i2]);
                            C0004.m1532(arrayList2, C0011.m2808(C0042.m7113(255, (iM64562 >> 16) & 255, (iM64562 >> 8) & 255, iM64562 & 255)));
                        }
                    }
                    while (C0009.m2139(arrayList) < 7) {
                        C0004.m1532(arrayList, C0057.m9003());
                    }
                    while (C0009.m2139(arrayList2) < 7) {
                        C0004.m1532(arrayList2, C0011.m2808(-16777216));
                    }
                    C0057.m8961(bufferedReader);
                    return;
                } catch (Throwable th) {
                    try {
                        C0057.m8961(bufferedReader);
                    } catch (Throwable th2) {
                        try {
                            C0052.m8352(C0057.m8970(Throwable.class, C0014.m3332(m5917(), 51, 13, 1822), new Class[]{Throwable.class}), th, new Object[]{th2});
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0049.m7975(e);
            }
        }
        C0052.m8327(this);
    }

    public void e() {
        C0017.m3687(C0062.m9406(this));
        ArrayList arrayList = (ArrayList) C0062.m9424(this);
        C0017.m3687(arrayList);
        ArrayList arrayList2 = (ArrayList) C0046.m7731(this);
        C0017.m3687(arrayList2);
        for (int i = 0; i < 7; i++) {
            C0004.m1532(arrayList, C0057.m9003());
            C0004.m1532(arrayList2, C0011.m2808(-16777216));
        }
    }
}