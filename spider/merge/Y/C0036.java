package com.github.catvod.spider.merge.Y;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.location.GnssStatus;
import android.text.TextUtils;
import android.util.Size;
import android.util.SparseLongArray;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Cupfox;
import com.github.catvod.spider.Ddrk;
import com.github.catvod.spider.Duboku;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBCupfox;
import com.github.catvod.spider.HBqiJi;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.F.c;
import com.github.catvod.spider.merge.F.g;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0155l;
import com.github.catvod.spider.merge.F0.X;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G0.b;
import com.github.catvod.spider.merge.H0.f;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.h;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U.m;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.D;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.t;
import com.github.catvod.spider.merge.W.p;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.C0230a;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z.d;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnClickListenerC0248i;
import com.github.catvod.spider.merge.a0.RunnableC0261w;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0275e;
import com.github.catvod.spider.merge.e.C0277g;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0304g;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.AbstractC0324d;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.JsonObject;
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.Y.ۣۨۧۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0036 {

    /* renamed from: ۟۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int f686 = 917;

    /* renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String[] m6169(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((ApplvDV2) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static b[] m6170() {
        if (C0038.m6471() >= 0) {
            return C0230a.p;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6171(Object obj) {
        if (C0047.m7837() > 0) {
            return ((C0155l) obj).f();
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static g m6172(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((c) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6173(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return ((f) obj).h((v) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static j m6174() {
        if (C0055.m8740() > 0) {
            return AbstractC0324d.a;
        }
        return null;
    }

    /* renamed from: ۟۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m6175(Object obj) {
        if (C0002.m1242() > 0) {
            return Duboku.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static void m6176(Object obj) {
        if (C0049.m8038() <= 0) {
            ((A) obj).y();
        }
    }

    /* renamed from: ۟۠ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6177(Object obj, int i) {
        if (C0001.m1164() <= 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* renamed from: ۟۠ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static void m6178(Object obj, boolean z) {
        if (C0023.m4566() <= 0) {
            ((View) obj).setWillNotDraw(z);
        }
    }

    /* renamed from: ۟۠ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static void m6179(Object obj, int i, long j) {
        if (C0055.m8740() >= 0) {
            ((SparseLongArray) obj).put(i, j);
        }
    }

    /* renamed from: ۟۠ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static String m6180(Object obj) {
        if (C0061.m9359() < 0) {
            return ((Class) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m6181(Object obj, Object obj2) {
        if (C0029.m5282() >= 0) {
            return ((Ddrk) obj).getPlayUrl((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static E m6182(Object obj, Object obj2, Object obj3) {
        if (C0037.m6350() < 0) {
            return ((C0176b) obj).N((String) obj2, (D) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static String m6183(Object obj) {
        if (C0011.m2755() > 0) {
            return ((AList) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static int m6184(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((Color) obj).toArgb();
        }
        return 0;
    }

    /* renamed from: ۟ۡۥۤ۠, reason: not valid java name and contains not printable characters */
    public static void m6185(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() < 0) {
            ((StateListDrawable) obj).addState((int[]) obj2, (Drawable) obj3);
        }
    }

    /* renamed from: ۟ۡۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m6186(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((View) obj).getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: ۟ۡۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m6187(Object obj) {
        if (C0000.m1116() < 0) {
            ((W) obj).b();
        }
    }

    /* renamed from: ۟ۢ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6189() {
        if (C0038.m6471() >= 0) {
            return com.github.catvod.spider.merge.D.f.F();
        }
        return null;
    }

    /* renamed from: ۟ۢۡۧ۠, reason: not valid java name and contains not printable characters */
    public static void m6190(Object obj, Object obj2, Object obj3) {
        if (C0013.m3167() >= 0) {
            ((com.github.catvod.spider.merge.N0.b) obj).f((StringBuffer) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static int m6191(Object obj) {
        if (C0045.m7538() < 0) {
            return ((LinkedList) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static Map m6192(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((d) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m6193(Object obj, int i, Object obj2) {
        if (C0062.m9429() > 0) {
            return ((List) obj).set(i, obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m6194(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            return TextUtils.join((CharSequence) obj, (Iterable) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m6195(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).i();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static Pattern m6196() {
        if (m6252() > 0) {
            return com.github.catvod.spider.merge.S0.b.d;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m6197(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((Process) obj).waitFor();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static String m6198(Object obj) {
        if (C0013.m3167() > 0) {
            return m.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m6199(Object obj) {
        if (C0019.m4065() < 0) {
            return ((HBqiJi) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۡۦۥ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m6200(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((com.github.catvod.spider.merge.W.D) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤۢۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6201() {
        if (C0046.m7701() >= 0) {
            return s.c;
        }
        return false;
    }

    /* renamed from: ۟ۤۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6202(Object obj, Object obj2) {
        if (C0029.m5282() > 0) {
            return ((Cupfox) obj).e((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۤۡۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0152i m6203(Object obj) {
        if (C0057.m9017() > 0) {
            return ((X) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static h m6204() {
        if (C0058.m9131() < 0) {
            return n.l;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int m6205(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۥ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m6206(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((C0253n) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۢ۟, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m6207(Object obj) {
        if (C0046.m7701() > 0) {
            return ((com.github.catvod.spider.merge.T0.g) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۥۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Date m6208(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.merge.G.c) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۣۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m6209(Object obj) {
        if (m6252() > 0) {
            return ((Bili) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۣۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m6210(Object obj) {
        if (C0005.m1599() < 0) {
            return ((CopyOnWriteArrayList) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟ۥۥۤ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m6211(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return com.github.catvod.spider.merge.a1.j.a((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۨۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6212(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return ((List) obj).remove(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static C0254o m6213(Object obj) {
        if (C0052.m8320() > 0) {
            return ((DialogInterfaceOnClickListenerC0248i) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6214(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).o();
        }
        return false;
    }

    /* renamed from: ۟ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static ShapeDrawable m6215(Object obj, int i, int i2) {
        if (C0014.m3353() < 0) {
            return C0304g.c((Context) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢ۟, reason: not valid java name and contains not printable characters */
    public static String m6216(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0018.m3956() >= 0) {
            return FishHxq.t((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m6217(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            ((AccessibilityNodeInfo) obj).setTooltipText((CharSequence) obj2);
        }
    }

    /* renamed from: ۟ۧ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static JSONObject m6218(Object obj, Object obj2, Object obj3) {
        if (C0039.m6529() < 0) {
            return ((FishHxq) obj).o((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m6219() {
        if (C0045.m7538() <= 0) {
            com.github.catvod.spider.merge.D.f.E();
        }
    }

    /* renamed from: ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m6220() {
        if (C0060.m9355() > 0) {
            return "/proxy?do=seachdanmu&go=fastsaech`;\n      window.location.href = url;\n    }\n    \n    function sendScanRequest() {\n      fetch('";
        }
        return null;
    }

    /* renamed from: ۟ۧۥۨ۟, reason: not valid java name and contains not printable characters */
    public static JSONObject m6221(Object obj, Object obj2, Object obj3) {
        if (C0047.m7837() >= 0) {
            return AppYsV2.fixJsonVodHeader((JSONObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧۧۥۨ, reason: not valid java name and contains not printable characters */
    public static void m6222(Object obj, int i) {
        if (C0058.m9131() < 0) {
            ((GradientDrawable) obj).setColor(i);
        }
    }

    /* renamed from: ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m6223(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return ((AlertDialog.Builder) obj).setTitle((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String[] m6224() {
        if (C0030.m5375() > 0) {
            return com.github.catvod.spider.merge.T0.a.d;
        }
        return null;
    }

    /* renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m6225(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m6226(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((com.github.catvod.spider.merge.E0.d) obj).f;
        }
        return null;
    }

    /* renamed from: ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m6227(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0023.m4566() < 0) {
            return ((HBCupfox) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۡۡۦۣ, reason: not valid java name and contains not printable characters */
    public static C0233B m6228(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((RunnableC0261w) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static void m6229(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            ((com.github.catvod.spider.merge.E.h) obj).a((String) obj2);
        }
    }

    /* renamed from: ۡۥۧۥ, reason: not valid java name and contains not printable characters */
    public static Pattern m6230() {
        if (C0048.m7971() >= 0) {
            return AppZzun.d;
        }
        return null;
    }

    /* renamed from: ۡۦۧ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V0.n m6231(Object obj) {
        if (C0062.m9429() > 0) {
            return ((t) obj).a;
        }
        return null;
    }

    /* renamed from: ۢ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static Socket m6232(Object obj, Object obj2, int i, Object obj3, int i2) {
        if (C0033.m5872() >= 0) {
            return ((SocketFactory) obj).createSocket((InetAddress) obj2, i, (InetAddress) obj3, i2);
        }
        return null;
    }

    /* renamed from: ۣۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6233(Object obj) {
        if (C0062.m9429() > 0) {
            return ((C0277g) obj).hasNext();
        }
        return false;
    }

    /* renamed from: ۢ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m6234(Object obj, Object obj2) {
        if (C0064.m9659() <= 0) {
            com.github.catvod.spider.merge.g0.g.p((List) obj, (String) obj2);
        }
    }

    /* renamed from: ۢۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int m6235(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.s) obj).i;
        }
        return 0;
    }

    /* renamed from: ۢۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.e1.b m6236(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((com.github.catvod.spider.merge.g1.d) obj).b;
        }
        return null;
    }

    /* renamed from: ۢۧۡۡ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m6237(Object obj, boolean z) {
        if (C0039.m6529() <= 0) {
            return ((StringBuffer) obj).append(z);
        }
        return null;
    }

    /* renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static String m6238() {
        if (C0064.m9659() <= 0) {
            return "search_header";
        }
        return null;
    }

    /* renamed from: ۢۨۦۢ, reason: not valid java name and contains not printable characters */
    public static String m6239() {
        if (C0004.m1557() <= 0) {
            return "替换";
        }
        return null;
    }

    /* renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m6240() {
        if (C0010.m2320() < 0) {
            return ":9978/action?do=refresh&type=danmaku&path=http://127.0.0.1:9997/proxy?do=";
        }
        return null;
    }

    /* renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m6241(Object obj, int i) {
        if (C0026.m4977() < 0) {
            return Arrays.binarySearch((int[]) obj, i);
        }
        return 0;
    }

    /* renamed from: ۣۢۧۥ, reason: not valid java name and contains not printable characters */
    public static String m6242(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).h;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.m m6243(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).N((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6244(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            return ((AbstractCollection) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int m6245(Object obj, int i) {
        if (C0029.m5282() >= 0) {
            return ((GnssStatus) obj).getConstellationType(i);
        }
        return 0;
    }

    /* renamed from: ۣۦۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m6246(Object obj, Object obj2) {
        if (C0049.m8038() <= 0) {
            return ((B) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m6247(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            ((w) obj).u((com.github.catvod.spider.p000mergexbpq.T.c) obj2);
        }
    }

    /* renamed from: ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6248(Object obj) {
        if (C0052.m8320() > 0) {
            return com.github.catvod.spider.merge.Z0.h.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۤ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m6249() {
        if (C0030.m5375() > 0) {
            return C0275e.d;
        }
        return null;
    }

    /* renamed from: ۤۥۣۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.N0.b m6250(Object obj) {
        if (C0038.m6471() > 0) {
            return ((com.github.catvod.spider.merge.N0.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۤۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6251(Object obj) {
        if (C0059.m9257() < 0) {
            return ((View) obj).isFocusable();
        }
        return false;
    }

    /* renamed from: ۤۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m6252() {
        return (-868) ^ C0043.f745;
    }

    /* renamed from: ۥۢۥۧ, reason: contains not printable characters */
    public static int m6253(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.P0.A) obj).b;
        }
        return 0;
    }

    /* renamed from: ۥۤۥۥ, reason: contains not printable characters */
    public static int m6254(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((j) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥۤۦۡ, reason: contains not printable characters */
    public static String m6255() {
        if (C0011.m2755() >= 0) {
            return "{class}";
        }
        return null;
    }

    /* renamed from: ۥۧ۠۟, reason: contains not printable characters */
    public static boolean m6256(Object obj) {
        if (C0007.m1886() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.S.j) obj).f();
        }
        return false;
    }

    /* renamed from: ۥۨۡۦ, reason: contains not printable characters */
    public static boolean m6257(Object obj, Object obj2, Object obj3) {
        if (C0029.m5282() >= 0) {
            return ((Path) obj).op((Path) obj2, (Path.Op) obj3);
        }
        return false;
    }

    /* renamed from: ۦ۠ۦۤ, reason: contains not printable characters */
    public static String m6258(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((Config) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۢۡ۟, reason: contains not printable characters */
    public static String m6259() {
        if (C0043.m7332() >= 0) {
            return "强制解析";
        }
        return null;
    }

    /* renamed from: ۦۢۢ, reason: contains not printable characters */
    public static int m6260(Object obj) {
        if (C0047.m7837() > 0) {
            return ((Size) obj).getHeight();
        }
        return 0;
    }

    /* renamed from: ۦۤ۟, reason: contains not printable characters */
    public static String m6261(Object obj) {
        if (C0032.m5686() < 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* renamed from: ۦۥۤ۠, reason: contains not printable characters */
    public static boolean m6262() {
        if (C0018.m3956() >= 0) {
            return p.c;
        }
        return false;
    }

    /* renamed from: ۦۥۧۤ, reason: contains not printable characters */
    public static String m6263(Object obj) {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.Z0.m.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۦۡۦ, reason: contains not printable characters */
    public static int m6264(Object obj) {
        if (C0022.m4497() > 0) {
            return ((WindowInsets) obj).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static String m6265() {
        if (C0028.m5152() <= 0) {
            return "调试->getJsonArrayStringAction出错：";
        }
        return null;
    }

    /* renamed from: ۟ۢ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6188(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}