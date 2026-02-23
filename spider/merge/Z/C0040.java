package com.github.catvod.spider.merge.Z;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.SparseLongArray;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Duboku;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBQG;
import com.github.catvod.spider.HBhaiM;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBmengya;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.Push;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.XPath;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.h;
import com.github.catvod.spider.merge.F.p;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0168z;
import com.github.catvod.spider.merge.F0.k0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.i;
import com.github.catvod.spider.merge.P0.q;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.k;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.C0180d;
import com.github.catvod.spider.merge.U0.N;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.o;
import com.github.catvod.spider.merge.W.j;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.m;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.U;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.RunnableC0263a;
import com.github.catvod.spider.merge.c.C0264a;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.RunnableC0312A;
import com.github.catvod.spider.merge.h0.RunnableC0327g;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b.n;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.g;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge.Z.ۡۤ۠۟, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0040 {

    /* renamed from: ۣۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int f694 = -145;

    /* renamed from: ۟۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m6579(Object obj) {
        if (C0022.m4497() > 0) {
            return ((M) obj).k;
        }
        return null;
    }

    /* renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6580() {
        if (C0016.m3596() <= 0) {
            return "/proxy?do=seachdanmu&go=fastsaech')\n        .then(() => showMessage('▶ 已触发快速播放', 'success'))\n        .catch(() => showMessage('❌ 搜索请求失败', 'failure'));\n      setTimeout(hideMessage, 3000);\n    }\n    \n    function fastSearch() {\n      const url = `";
        }
        return null;
    }

    /* renamed from: ۟۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m6581() {
        if (C0028.m5152() < 0) {
            return "影片类型";
        }
        return null;
    }

    /* renamed from: ۟۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6582() {
        return (-708) ^ C0030.f514;
    }

    /* renamed from: ۟۠۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.l0.c m6583(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).j;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m6585(Object obj) {
        if (C0001.m1164() < 0) {
            return ((AccessibilityNodeInfo.AccessibilityAction) obj).getId();
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m6586() {
        if (C0000.m1116() < 0) {
            return "A&B&C&D&E&F&G&H&I&J&K&L&M&N&O&P&Q&R&S&T&U&V&W&X&Y&Z";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m6587(Object obj) {
        if (C0024.m4693() <= 0) {
            ((A) obj).k();
        }
    }

    /* renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static C0315D m6588(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((RunnableC0312A) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static void m6589(Object obj) {
        if (C0053.m8389() >= 0) {
            ((x) obj).a();
        }
    }

    /* renamed from: ۟۠ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static void m6590(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            ((XPath) obj).d((String) obj2);
        }
    }

    /* renamed from: ۟۠ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static void m6591(Object obj, Object obj2, Object obj3) {
        if (C0045.m7538() <= 0) {
            ((i) obj).c((Calendar) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟۠ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m6592() {
        if (C0037.m6350() <= 0) {
            return "次";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m6593(Object obj, Object obj2) {
        if (C0003.m1463() <= 0) {
            return ((Market) obj).actPhp((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m6594(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((com.github.catvod.spider.merge.T.c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m6595() {
        if (C0041.m6823() <= 0) {
            return "\\$";
        }
        return null;
    }

    /* renamed from: ۟ۡۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m6596(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            ((com.github.catvod.spider.merge.P.a) obj).b((com.github.catvod.spider.merge.P.b) obj2);
        }
    }

    /* renamed from: ۟ۡۦۣۧ, reason: not valid java name and contains not printable characters */
    public static C0180d m6597() {
        if (C0037.m6350() <= 0) {
            return B.k;
        }
        return null;
    }

    /* renamed from: ۟ۡۨۤۨ, reason: not valid java name and contains not printable characters */
    public static int m6598(Object obj) {
        if (C0010.m2320() < 0) {
            return ((C0168z) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۡۨۥۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.W.x m6599(Object obj) {
        if (C0018.m3956() > 0) {
            return ((j) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m6600(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۟ۢۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Path.Direction m6601() {
        if (C0050.m8121() < 0) {
            return Path.Direction.CW;
        }
        return null;
    }

    /* renamed from: ۟ۢۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m6602(Object obj) {
        if (m6582() > 0) {
            return ((k) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۢۤ, reason: not valid java name and contains not printable characters */
    public static int m6603(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((LinearLayout.LayoutParams) obj).gravity;
        }
        return 0;
    }

    /* renamed from: ۟ۢۤۧۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m6604(Object obj) {
        if (C0005.m1599() < 0) {
            return ((m) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m6605(Object obj) {
        if (C0024.m4693() < 0) {
            return ((p) obj).c();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m6606(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0029.m5282() >= 0) {
            ((OutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* renamed from: ۣ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6607(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((WindowInsets) obj).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m6608(int i, int i2, int i3) {
        if (C0046.m7701() > 0) {
            return Color.rgb(i, i2, i3);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m6609(Object obj) {
        if (m6582() > 0) {
            return ((C0259u) obj).b();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m6610(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m6611(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            ((W) obj).o((String) obj2);
        }
    }

    /* renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static String m6612(Object obj, Object obj2, Object obj3) {
        if (C0006.m1726() < 0) {
            return com.github.catvod.spider.merge.V.a.d((String) obj, (TreeMap) obj2, (TreeMap) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V.a m6613(Object obj) {
        if (C0046.m7701() > 0) {
            return ((HBDmSou) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m6614(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            ((g) obj).d((String) obj2);
        }
    }

    /* renamed from: ۟ۤۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m6615(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0020.m4210() <= 0) {
            return ((HBmengya) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6616(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            return ((ArrayList) obj).remove(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥۡۤۢ, reason: not valid java name and contains not printable characters */
    public static P m6617(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((C0176b) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۥۥۨۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m6618(Object obj) {
        if (C0051.m8216() < 0) {
            return ((HBmoou) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6619(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.merge.G.c) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۥۨۧۧ, reason: not valid java name and contains not printable characters */
    public static String m6620() {
        if (C0002.m1242() >= 0) {
            return "\"url\"*\"&&\"";
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m6621(Object obj) {
        if (C0060.m9355() > 0) {
            ((A) obj).K();
        }
    }

    /* renamed from: ۟ۦۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m6622(Object obj, Object obj2, int i) {
        if (C0011.m2755() > 0) {
            ((o) obj).b((r) obj2, i);
        }
    }

    /* renamed from: ۟ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6623(Object obj) {
        if (C0024.m4693() <= 0) {
            return com.github.catvod.spider.merge.M0.d.d((CharSequence[]) obj);
        }
        return false;
    }

    /* renamed from: ۟ۦۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m6624(Object obj) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.merge.U.i) obj).f;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static String m6625() {
        if (C0021.m4379() >= 0) {
            return "\" alt=\n      \"";
        }
        return null;
    }

    /* renamed from: ۟ۧۡۡۨ, reason: not valid java name and contains not printable characters */
    public static k0 m6626() {
        if (C0022.m4497() >= 0) {
            return com.github.catvod.spider.merge.U.c.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static W m6627(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((U) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧۢۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6628() {
        if (C0006.m1726() < 0) {
            return "remark";
        }
        return null;
    }

    /* renamed from: ۟ۧۤۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6629(Object obj, Object obj2, Object obj3) {
        if (C0037.m6350() < 0) {
            return n.b((StringBuilder) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6630(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((com.github.catvod.spider.merge.w0.b) obj).getSignature();
        }
        return null;
    }

    /* renamed from: ۟ۧۧۤۡ, reason: not valid java name and contains not printable characters */
    public static void m6631(Object obj, Object obj2, int i) {
        if (C0012.m3024() >= 0) {
            ((com.github.catvod.spider.merge.W.x) obj).e((ImageButton) obj2, i);
        }
    }

    /* renamed from: ۠ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static String m6632(int i, Object obj) {
        if (C0059.m9257() < 0) {
            return com.github.catvod.spider.merge.f1.b.b(i, (String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static String m6633() {
        if (m6582() >= 0) {
            return "#h";
        }
        return null;
    }

    /* renamed from: ۠ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static String m6634(Object obj) {
        if (m6582() >= 0) {
            return ((Method) obj).getName();
        }
        return null;
    }

    /* renamed from: ۡ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static Cloud m6635(Object obj) {
        if (C0042.m7147() < 0) {
            return ((Push) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۢۡۦ, reason: not valid java name and contains not printable characters */
    public static Method m6636(Object obj) {
        if (C0041.m6823() < 0) {
            return ((com.github.catvod.spider.merge.g1.d) obj).d;
        }
        return null;
    }

    /* renamed from: ۡۢۢۦ, reason: not valid java name and contains not printable characters */
    public static ImageButton m6637(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((com.github.catvod.spider.merge.W.x) obj).e;
        }
        return null;
    }

    /* renamed from: ۡۢۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6638(Object obj, Object obj2) {
        if (C0013.m3167() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.r) obj).o((String) obj2);
        }
        return false;
    }

    /* renamed from: ۡۤ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m6639(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((C0264a) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int m6640(Object obj) {
        if (C0058.m9131() < 0) {
            return ((SparseLongArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m6641(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((com.github.catvod.spider.merge.E0.d) obj).i;
        }
        return 0;
    }

    /* renamed from: ۢ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6642(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            return ((HBlingDu) obj).d64((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static SSLSocketFactory m6643(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((SSLContext) obj).getSocketFactory();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static float m6644(float f) {
        if (C0032.m5686() <= 0) {
            return Math.abs(f);
        }
        return 0.0f;
    }

    /* renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static int m6645(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۤ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.Q.a m6646(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.k) obj).b((char[]) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.o m6647(Object obj, Object obj2) {
        if (C0012.m3024() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.o) obj).r0((l) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6648(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge.U0.M) obj).l();
        }
        return false;
    }

    /* renamed from: ۤۢۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6649(Object obj) {
        if (C0041.m6823() <= 0) {
            return Duboku.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static Runnable m6650(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((HBhaiM) obj).showdig();
        }
        return null;
    }

    /* renamed from: ۤۤۦۣ, reason: not valid java name and contains not printable characters */
    public static String m6651() {
        if (C0049.m8038() <= 0) {
            return "调试->getJsonString出错：";
        }
        return null;
    }

    /* renamed from: ۤۦۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m6652(Object obj, Object obj2) {
        if (C0064.m9659() <= 0) {
            return ((Context) obj).getSystemService((Class) obj2);
        }
        return null;
    }

    /* renamed from: ۤۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m6653(Object obj, Object obj2, long j) {
        if (C0024.m4693() <= 0) {
            return ((SharedPreferences.Editor) obj).putLong((String) obj2, j);
        }
        return null;
    }

    /* renamed from: ۤۨۢۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m6654(Object obj) {
        if (C0008.m1975() > 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).c();
        }
        return null;
    }

    /* renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static void m6655(Object obj, int i) {
        if (C0010.m2320() <= 0) {
            ((StringBuilder) obj).setLength(i);
        }
    }

    /* renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.N0.b m6656() {
        if (m6582() >= 0) {
            return com.github.catvod.spider.merge.N0.b.p;
        }
        return null;
    }

    /* renamed from: ۥ۟ۤۥ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m6657(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((com.github.catvod.spider.merge.E0.o) obj).g();
        }
        return null;
    }

    /* renamed from: ۥ۟ۥۢ, reason: contains not printable characters */
    public static void m6658(Object obj, Object obj2, Object obj3) {
        if (C0042.m7147() <= 0) {
            ((Logger) obj).log((Level) obj2, (String) obj3);
        }
    }

    /* renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public static Bitmap m6659(Object obj) {
        if (C0047.m7837() >= 0) {
            return BitmapFactory.decodeStream((InputStream) obj);
        }
        return null;
    }

    /* renamed from: ۥۣۣۣ, reason: contains not printable characters */
    public static void m6660(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            ((P) obj).f((N) obj2);
        }
    }

    /* renamed from: ۥۣۣۤ, reason: contains not printable characters */
    public static String m6661() {
        if (C0060.m9355() > 0) {
            return "\" tabindex=\"0\" />\n                </div>\n                <button id=\"sendDanmuBtn\" tabindex=\"0\">发送弹幕</button>\n            `;\n            \n            // 添加到DOM中，放在搜索容器下方\n            const searchContainer = document.querySelector('.search-container');\n            searchContainer.parentNode.insertBefore(danmuPanel, searchContainer.nextSibling);\n            \n            // 获取面板内元素引用\n            const danmuMessage = document.getElementById('danmuMessage');\n            const danmuUsername = document.getElementById('danmuUsername');\n            const sendDanmuBtn = document.getElementById('sendDanmuBtn');\n            \n            // 绑定发送事件\n            sendDanmuBtn.addEventListener('click', () => sendDanmu(danmuUsername, danmuMessage));\n            \n            // 绑定Enter发送事件\n            danmuMessage.addEventListener('keydown', e => {\n                if (e.key === 'Enter' && !e.shiftKey) {\n                    e.preventDefault();\n                    sendDanmu(danmuUsername, danmuMessage);\n                }\n            });\n            \n            // 更新可聚焦元素列表\n            updateFocusableElements();\n            \n            // 设置焦点到文本框\n            setTimeout(() => danmuMessage.focus(), 100);\n        }\n        \n        // 发送弹幕\n        function sendDanmu(usernameEl, messageEl) {\n            const username = usernameEl.value.trim();\n            const message = messageEl.value.trim();\n            \n            if (!username) return showStatus('请输入昵称', 'failure');\n            if (!message) return showStatus('请输入弹幕内容', 'failure');\n            if (message.length > 50) return showStatus('弹幕内容过长（≤50字）', 'failure');\n\n            const url = `";
        }
        return null;
    }

    /* renamed from: ۥۤۥۣ, reason: contains not printable characters */
    public static int m6662(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((RunnableC0327g) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥۨ۠ۥ, reason: contains not printable characters */
    public static Config m6663(Object obj) {
        if (m6582() > 0) {
            return ((RunnableC0263a) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۥۧۡ, reason: contains not printable characters */
    public static Object m6664(Object obj, Object obj2) {
        if (C0042.m7147() <= 0) {
            return ((ConcurrentHashMap) obj).remove(obj2);
        }
        return null;
    }

    /* renamed from: ۦۦ۠ۥ, reason: contains not printable characters */
    public static int m6665(Object obj) {
        if (C0060.m9355() > 0) {
            return ((com.github.catvod.spider.merge.d0.b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۦ۠ۧ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m6666(Object obj) {
        if (C0047.m7837() > 0) {
            return ((com.github.catvod.spider.merge.X0.c) obj).e;
        }
        return null;
    }

    /* renamed from: ۦۦۣ, reason: contains not printable characters */
    public static void m6667(Object obj) {
        if (C0008.m1975() > 0) {
            ((Dialog) obj).hide();
        }
    }

    /* renamed from: ۦۣۨ۠, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m6668(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((com.github.catvod.spider.merge.X0.g) obj).e;
        }
        return null;
    }

    /* renamed from: ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m6669(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            ((Drawable) obj).setBounds((Rect) obj2);
        }
    }

    /* renamed from: ۧ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static JSONArray m6670(Object obj, double d) {
        if (C0038.m6471() >= 0) {
            return ((JSONArray) obj).put(d);
        }
        return null;
    }

    /* renamed from: ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m6671(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.merge.D.f) obj).h;
        }
        return null;
    }

    /* renamed from: ۧۢۨۥ, reason: not valid java name and contains not printable characters */
    public static Context m6672(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((HBQG) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.l0.g m6673(Object obj) {
        if (C0041.m6823() < 0) {
            return ((com.github.catvod.spider.merge.l0.j) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static String m6674() {
        if (C0021.m4379() > 0) {
            return "详情信息获取错误！getDescInfo()-->";
        }
        return null;
    }

    /* renamed from: ۧۥۥۥ, reason: not valid java name and contains not printable characters */
    public static void m6675(Object obj, boolean z) {
        if (C0042.m7147() <= 0) {
            ((AccessibilityNodeInfo) obj).setContentInvalid(z);
        }
    }

    /* renamed from: ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m6676(Object obj, Object obj2, Object obj3) {
        if (C0049.m8038() <= 0) {
            ((com.github.catvod.spider.merge.T0.c) obj).a(obj2, (String) obj3);
        }
    }

    /* renamed from: ۧۦۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6677(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((View) obj).requestFocus();
        }
        return false;
    }

    /* renamed from: ۧۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Icon m6678(Object obj) {
        if (C0026.m4977() <= 0) {
            return Icon.createWithBitmap((Bitmap) obj);
        }
        return null;
    }

    /* renamed from: ۧۧۧۧ, reason: not valid java name and contains not printable characters */
    public static String m6679() {
        if (C0021.m4379() > 0) {
            return ", filter=";
        }
        return null;
    }

    /* renamed from: ۧۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m6680(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((C0259u) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6681(char c) {
        if (C0046.m7701() >= 0) {
            return Character.isLetterOrDigit(c);
        }
        return false;
    }

    /* renamed from: ۨ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m6682(Object obj, boolean z) {
        if (C0039.m6529() <= 0) {
            ((View) obj).setPressed(z);
        }
    }

    /* renamed from: ۣۨۧۧ, reason: not valid java name and contains not printable characters */
    public static int m6683(Object obj) {
        if (C0019.m4065() < 0) {
            return ((q) obj).a;
        }
        return 0;
    }

    /* renamed from: ۨۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m6684() {
        if (C0012.m3024() >= 0) {
            return "/proxy?do=seachdanmu&go=index\" class=\"control-btn home-btn\">\n                    <div class=\"btn-icon\">🏠</div>\n                    <div class=\"btn-text\">返回主页</div>\n                </a>\n                <a href=\"";
        }
        return null;
    }

    /* renamed from: ۨۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m6685(Object obj, Object obj2) {
        if (C0015.m3433() >= 0) {
            return ((UC) obj).detailContentVodPlayUrl((List) obj2);
        }
        return null;
    }

    /* renamed from: ۣۨۧ, reason: not valid java name and contains not printable characters */
    public static h m6686(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((com.github.catvod.spider.merge.E0.o) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m6584(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}