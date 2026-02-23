package com.github.catvod.spider.merge.Z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.ssl.SSLSockets;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Cupfox;
import com.github.catvod.spider.Ddrk;
import com.github.catvod.spider.Dm84;
import com.github.catvod.spider.HB360;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBT4;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.Kanqiu;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.YiSo;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0168z;
import com.github.catvod.spider.merge.F0.InterfaceC0167y;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.f0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.U0.C;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.u;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0267b;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.w0.g;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.InterfaceC0066d;
import com.github.catvod.spider.p000mergexbpq.P.r;
import com.github.catvod.spider.p000mergexbpq.P.z;
import com.github.catvod.spider.p000mergexbpq.Q.B;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.Z.۟۟۠ۢۤ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0037 {

    /* renamed from: ۟ۡۢۧۥ, reason: not valid java name and contains not printable characters */
    public static int f691 = -672;

    /* renamed from: ۟۟ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6301(Object obj) {
        if (C0017.m3633() < 0) {
            return ((com.github.catvod.spider.merge.D.f) obj).d;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m6302() {
        if (C0023.m4566() <= 0) {
            return "sourcekey";
        }
        return null;
    }

    /* renamed from: ۟۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m6303(Object obj) throws IOException {
        if (C0019.m4065() <= 0) {
            ((ZipFile) obj).close();
        }
    }

    /* renamed from: ۟۠۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m6304(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static C0288g m6305(Object obj) {
        if (C0049.m8038() <= 0) {
            return C0288g.e((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static String[] m6306(Object obj) {
        if (C0052.m8320() > 0) {
            return ((HBT4) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۡۢۤ۟, reason: not valid java name and contains not printable characters */
    public static int m6308() {
        if (C0059.m9257() <= 0) {
            return C0281k.e;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m6309(Object obj, int i) {
        if (C0033.m5872() > 0) {
            ((WebSettings) obj).setCacheMode(i);
        }
    }

    /* renamed from: ۟ۡۤۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m6310(Object obj, Object obj2) {
        if (C0028.m5152() <= 0) {
            return ((com.github.catvod.spider.merge.X0.f) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤۦۡ, reason: not valid java name and contains not printable characters */
    public static String m6311(Object obj, Object obj2) {
        if (C0013.m3167() >= 0) {
            return ((HBDmSou) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m6312(Object obj) {
        if (C0042.m7147() <= 0) {
            return obj.toString();
        }
        return null;
    }

    /* renamed from: ۟ۢۡۢۧ, reason: not valid java name and contains not printable characters */
    public static int m6313(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m6314(Object obj, int i) {
        if (C0055.m8740() > 0) {
            return ((List) obj).remove(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6315(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return ((AbstractMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m6316(Object obj, Object obj2) {
        if (C0049.m8038() <= 0) {
            ((B) obj).e((InterfaceC0066d) obj2);
        }
    }

    /* renamed from: ۟ۢۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m6317(Object obj) {
        if (C0035.m6140() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).k;
        }
        return null;
    }

    /* renamed from: ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6318(Object obj) {
        if (C0012.m3024() > 0) {
            return ((Scroller) obj).isFinished();
        }
        return false;
    }

    /* renamed from: ۟ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static void m6319(Object obj) {
        if (C0064.m9659() <= 0) {
            ((PrintWriter) obj).flush();
        }
    }

    /* renamed from: ۟ۢۧۥ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m6320(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return g.g((Collection) obj, (Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m6321() {
        if (C0063.m9589() < 0) {
            return "dtUrlSubNode";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6322(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).b;
        }
        return false;
    }

    /* renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6323() {
        if (C0036.m6252() > 0) {
            return "playerContent线程睡眠错误！-->";
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6324(Object obj) {
        if (C0020.m4210() < 0) {
            return ((C) obj).a();
        }
        return false;
    }

    /* renamed from: ۣ۟ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int m6325(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((P) obj).q;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m6326(Object obj) {
        if (m6350() < 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).h;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m6327() {
        if (C0001.m1164() < 0) {
            return "j0";
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m6328(Object obj, boolean z) {
        if (C0042.m7147() < 0) {
            SSLSockets.setUseSessionTickets((SSLSocket) obj, z);
        }
    }

    /* renamed from: ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static Class m6329() {
        if (C0018.m3956() >= 0) {
            return Integer.TYPE;
        }
        return null;
    }

    /* renamed from: ۟ۥۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static w m6330(Object obj) {
        if (C0014.m3353() < 0) {
            return ((u) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Class m6331() {
        if (C0058.m9131() < 0) {
            return Double.TYPE;
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m6332(Object obj, Object obj2) {
        if (C0029.m5282() > 0) {
            ((Activity) obj).registerComponentCallbacks((ComponentCallbacks) obj2);
        }
    }

    /* renamed from: ۟ۦۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m6333(Object obj) {
        if (C0050.m8121() <= 0) {
            return Uri.encode((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۢۧ, reason: not valid java name and contains not printable characters */
    public static f0 m6334(Object obj, int i) {
        if (C0019.m4065() < 0) {
            return f0.i((Q) obj, i);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Thread m6335(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((m) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۦۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m6336(Object obj, Object obj2) {
        if (C0012.m3024() >= 0) {
            ((ViewGroup) obj).addView((View) obj2);
        }
    }

    /* renamed from: ۟ۧۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m6337() {
        if (C0042.m7147() < 0) {
            return "--";
        }
        return null;
    }

    /* renamed from: ۟ۧۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m6338(Object obj, int i) {
        if (C0032.m5686() <= 0) {
            return ((q) obj).b(i);
        }
        return 0;
    }

    /* renamed from: ۟ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static int m6339(Object obj) {
        if (C0009.m2047() > 0) {
            return ((com.github.catvod.spider.merge.E0.f) obj).c;
        }
        return 0;
    }

    /* renamed from: ۠ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static int m6340(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            return ((ArrayList) obj).lastIndexOf(obj2);
        }
        return 0;
    }

    /* renamed from: ۠ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static String m6341(Object obj, Object obj2) {
        if (C0028.m5152() <= 0) {
            return ((YiSo) obj).decrypt((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static Pattern m6342(Object obj) {
        if (C0021.m4379() > 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).K;
        }
        return null;
    }

    /* renamed from: ۡ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m6343(Object obj) {
        if (C0004.m1557() < 0) {
            return ((Buffer) obj).capacity();
        }
        return 0;
    }

    /* renamed from: ۡ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m6344(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((View) obj).getWidth();
        }
        return 0;
    }

    /* renamed from: ۡۢۦۥ, reason: not valid java name and contains not printable characters */
    public static Rect m6345(Object obj) {
        if (C0018.m3956() > 0) {
            return ((Drawable) obj).getBounds();
        }
        return null;
    }

    /* renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static JSONObject m6346(Object obj, Object obj2, Object obj3) {
        if (C0063.m9589() < 0) {
            return AppZzun.fixJsonVodHeader((JSONObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۡۤۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6347(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            return Arrays.equals((Object[]) obj, (Object[]) obj2);
        }
        return false;
    }

    /* renamed from: ۡۥۣۣ, reason: not valid java name and contains not printable characters */
    public static String m6348(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((Thread) obj).getName();
        }
        return null;
    }

    /* renamed from: ۡۦۣۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6349(Object obj) {
        if (C0062.m9429() > 0) {
            return ((AbstractC0152i) obj).e;
        }
        return null;
    }

    /* renamed from: ۢۡۦۢ, reason: not valid java name and contains not printable characters */
    public static int m6350() {
        return 647 ^ C0026.f490;
    }

    /* renamed from: ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m6351() {
        if (C0019.m4065() <= 0) {
            return "') no-repeat center center fixed;\n            background-attachment: fixed;\n            display: flex;\n            flex-direction: column;\n            align-items: center;\n            justify-content: center;\n            min-height: 100vh;\n            padding: 20px;\n            position: relative;\n            color: #2c3e50;\n        }\n\n        /* 网格背景效果 */\n        body::before {\n            content: '';\n            position: fixed;\n            top: 0;\n            left: 0;\n            right: 0;\n            bottom: 0;\n            background-image: \n                linear-gradient(rgba(52, 152, 219, 0.08) 1px, transparent 1px),\n                linear-gradient(90deg, rgba(52, 152, 219, 0.08) 1px, transparent 1px);\n            background-size: 40px 40px;\n            pointer-events: none;\n            z-index: 0;\n        }\n\n        .container {\n            position: relative;\n            z-index: 10;\n            text-align: center;\n            animation: fadeInUp 0.8s ease-out;\n            max-width: 600px;\n            width: 100%;\n        }\n\n        @keyframes fadeInUp {\n            from {\n                opacity: 0;\n                transform: translateY(30px);\n            }\n            to {\n                opacity: 1;\n                transform: translateY(0);\n            }\n        }\n\n        h2 {\n            color: #2c3e50;\n            font-size: 2.5em;\n            margin-bottom: 10px;\n            text-shadow: 0 2px 4px rgba(52, 152, 219, 0.3);\n            letter-spacing: 2px;\n            font-weight: 700;\n            animation: slideInDown 0.6s ease-out;\n        }\n\n        .subtitle {\n            color: #7f8c8d;\n            font-size: 0.95em;\n            margin-bottom: 40px;\n            letter-spacing: 0.5px;\n        }\n\n        @keyframes slideInDown {\n            from {\n                opacity: 0;\n                transform: translateY(-30px);\n            }\n            to {\n                opacity: 1;\n                transform: translateY(0);\n            }\n        }\n\n        form {\n            background: rgba(255, 255, 255, 0.95);\n            backdrop-filter: blur(20px);\n            padding: 30px;\n            border-radius: 20px;\n            box-shadow: 0 10px 40px rgba(52, 152, 219, 0.15), 0 4px 20px rgba(0, 0, 0, 0.05);\n            border: 2px solid rgba(52, 152, 219, 0.1);\n            display: flex;\n            width: 100%;\n            margin-bottom: 25px;\n            transition: all 0.3s ease;\n        }\n\n        form:hover {\n            transform: translateY(-3px);\n            box-shadow: 0 15px 50px rgba(52, 152, 219, 0.2), 0 8px 25px rgba(0, 0, 0, 0.08);\n            border-color: rgba(52, 152, 219, 0.3);\n        }\n\n        input[type=\"text\"] {\n            padding: 15px 20px;\n            border: 2px solid rgba(52, 152, 219, 0.2);\n            border-radius: 14px;\n            flex: 1;\n            margin-right: 15px;\n            font-size: 16px;\n            transition: all 0.3s ease;\n            background: rgba(248, 250, 252, 0.9);\n            color: #2c3e50;\n        }\n\n        input[type=\"text\"]::placeholder {\n            color: #95a5a6;\n        }\n\n        input[type=\"text\"]:focus {\n            outline: none;\n            border-color: rgba(52, 152, 219, 0.6);\n            background: rgba(255, 255, 255, 1);\n            box-shadow: 0 0 0 4px rgba(52, 152, 219, 0.1), 0 0 25px rgba(52, 152, 219, 0.15);\n        }\n\n        input[type=\"submit\"] {\n            padding: 15px 35px;\n            background: linear-gradient(135deg, #3498db 0%, #2980b9 100%);\n            color: #fff;\n            border: none;\n            border-radius: 14px;\n            cursor: pointer;\n            font-size: 16px;\n            font-weight: 600;\n            transition: all 0.3s ease;\n            box-shadow: 0 6px 20px rgba(52, 152, 219, 0.3);\n            position: relative;\n            overflow: hidden;\n        }\n\n        input[type=\"submit\"]::before {\n            content: '';\n            position: absolute;\n            top: 0;\n            left: -100%;\n            width: 100%;\n            height: 100%;\n            background: linear-gradient(90deg, transparent, rgba(255, 255, 255, 0.2), transparent);\n            transition: left 0.5s;\n        }\n\n        input[type=\"submit\"]:hover::before {\n            left: 100%;\n        }\n\n        input[type=\"submit\"]:hover {\n            transform: translateY(-3px);\n            box-shadow: 0 8px 30px rgba(52, 152, 219, 0.4);\n            background: linear-gradient(135deg, #2980b9 0%, #1f618d 100%);\n        }\n\n        input[type=\"submit\"]:active {\n            transform: translateY(0);\n        }\n\n        .button-group {\n            display: grid;\n            grid-template-columns: 1fr 1fr;\n            gap: 15px;\n            margin-top: 20px;\n        }\n\n        .action-button {\n            display: flex;\n            flex-direction: column;\n            align-items: center;\n            justify-content: center;\n            color: #2c3e50;\n            text-decoration: none;\n            padding: 22px;\n            border-radius: 16px;\n            transition: all 0.3s ease;\n            background: rgba(255, 255, 255, 0.95);\n            backdrop-filter: blur(20px);\n            border: 2px solid rgba(52, 152, 219, 0.15);\n            font-size: 14px;\n            cursor: pointer;\n            box-shadow: 0 6px 25px rgba(52, 152, 219, 0.1), 0 2px 10px rgba(0, 0, 0, 0.05);\n            position: relative;\n            overflow: hidden;\n        }\n\n        .action-button::before {\n            content: '';\n            position: absolute;\n            top: 0;\n            left: 0;\n            right: 0;\n            bottom: 0;\n            background: linear-gradient(135deg, rgba(52, 152, 219, 0.08) 0%, rgba(41, 128, 185, 0.08) 100%);\n            opacity: 0;\n            transition: opacity 0.3s ease;\n        }\n\n        .action-button:hover::before {\n            opacity: 1;\n        }\n\n        .action-button:hover {\n            border-color: rgba(52, 152, 219, 0.4);\n            transform: translateY(-4px);\n            box-shadow: 0 12px 35px rgba(52, 152, 219, 0.2), 0 4px 15px rgba(0, 0, 0, 0.08);\n            color: #1f618d;\n        }\n\n        .action-button:active {\n            transform: translateY(-1px);\n        }\n\n        .action-button-icon {\n            font-size: 24px;\n            margin-bottom: 8px;\n        }\n\n        .action-button-text {\n            font-size: 13px;\n            color: #7f8c8d;\n            position: relative;\n            z-index: 1;\n            font-weight: 500;\n        }\n\n        /* 响应式设计 */\n        @media (max-width: 768px) {\n            h2 {\n                font-size: 2em;\n            }\n\n            form {\n                flex-direction: column;\n                padding: 20px;\n            }\n\n            input[type=\"text\"] {\n                margin-right: 0;\n                margin-bottom: 15px;\n            }\n\n            input[type=\"submit\"] {\n                width: 100%;\n            }\n        }\n    </style>\n</head>\n\n<body>\n    <div class=\"container\">\n  <button \n        style=\"position: absolute; right: 10px; top: 20px; transform: translateY(-50%); \n               background: none; border: none; cursor: pointer; font-size: 1.2em;\n               color: #667eea; transition: all 0.2s ease;\"\n        onclick=\"fetch('";
        }
        return null;
    }

    /* renamed from: ۢۢۨ۠, reason: not valid java name and contains not printable characters */
    public static void m6352(Object obj) {
        if (C0052.m8320() >= 0) {
            ((C0335o) obj).d();
        }
    }

    /* renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m6353(Object obj, Object obj2) {
        if (C0013.m3167() > 0) {
            return C0008.m2020((AlertDialog.Builder) obj, (DialogInterfaceOnDismissListenerC0243d) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۢۡ, reason: not valid java name and contains not printable characters */
    public static String m6354() {
        if (C0033.m5872() > 0) {
            return Kanqiu.a;
        }
        return null;
    }

    /* renamed from: ۢۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6355(Object obj) {
        if (C0059.m9257() < 0) {
            return ((Config) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m6356(Object obj) {
        if (C0001.m1164() < 0) {
            return ((Ddrk) obj).h;
        }
        return null;
    }

    /* renamed from: ۣ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0167y[] m6357(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((C0168z) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static String m6358(Object obj) {
        if (C0011.m2755() >= 0) {
            return Cupfox.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m6359(Object obj) {
        if (C0057.m9017() > 0) {
            return Collections.min((Collection) obj);
        }
        return null;
    }

    /* renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m6360(Object obj, Object obj2, int i) {
        if (C0016.m3596() <= 0) {
            return ((JSONObject) obj).put((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣۥۥ۠, reason: not valid java name and contains not printable characters */
    public static void m6361(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            ((WebView) obj).setWebViewClient((WebViewClient) obj2);
        }
    }

    /* renamed from: ۣۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m6362(Object obj, Object obj2, Object obj3) {
        if (C0001.m1164() < 0) {
            return ((AbstractMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static int m6363(Object obj) {
        if (C0019.m4065() < 0) {
            return ((Buffer) obj).remaining();
        }
        return 0;
    }

    /* renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static float m6364(int i, float f, Object obj) {
        if (C0054.m8557() < 0) {
            return TypedValue.applyDimension(i, f, (DisplayMetrics) obj);
        }
        return 0.0f;
    }

    /* renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m6365() {
        if (C0059.m9257() <= 0) {
            return "滑动验证";
        }
        return null;
    }

    /* renamed from: ۣۤۦۤ, reason: not valid java name and contains not printable characters */
    public static r m6366(Object obj) {
        if (C0023.m4566() < 0) {
            return ((z) obj).b();
        }
        return null;
    }

    /* renamed from: ۤۦۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6367(Object obj, Object obj2) {
        if (C0000.m1116() <= 0) {
            return ((TreeSet) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۤۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m6368(Object obj) {
        if (C0000.m1116() < 0) {
            HttpsURLConnection.setDefaultSSLSocketFactory((SSLSocketFactory) obj);
        }
    }

    /* renamed from: ۥ۠۟ۥ, reason: contains not printable characters */
    public static String m6369(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((Pattern) obj).pattern();
        }
        return null;
    }

    /* renamed from: ۥۢۡۢ, reason: contains not printable characters */
    public static float m6370(Object obj) {
        if (C0041.m6823() < 0) {
            return ((Float) obj).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: ۥۣۣۨ, reason: contains not printable characters */
    public static int m6371(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.E0.q) obj).e;
        }
        return 0;
    }

    /* renamed from: ۥۣۨۢ, reason: contains not printable characters */
    public static String m6372(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            return ((HB360) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۟ۧۧ, reason: contains not printable characters */
    public static String m6373(Object obj) {
        if (C0018.m3956() > 0) {
            return ((HBmoou) obj).c;
        }
        return null;
    }

    /* renamed from: ۦ۠۟ۦ, reason: contains not printable characters */
    public static List m6374(Object obj) {
        if (C0032.m5686() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.e) obj).e();
        }
        return null;
    }

    /* renamed from: ۦ۠ۥۥ, reason: contains not printable characters */
    public static List m6375(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            return ((AccessibilityNodeInfo) obj).findAccessibilityNodeInfosByViewId((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۠ۧۨ, reason: contains not printable characters */
    public static int m6376(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            return ((C0147d) obj).b(obj2);
        }
        return 0;
    }

    /* renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static LinearLayout m6377(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.merge.h0.Q) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۥۧۧ, reason: contains not printable characters */
    public static String[] m6378(Object obj) {
        if (C0049.m8038() < 0) {
            return ((C0174a) obj).h;
        }
        return null;
    }

    /* renamed from: ۦۦۡ, reason: contains not printable characters */
    public static String m6379() {
        if (C0023.m4566() < 0) {
            return "影片状态";
        }
        return null;
    }

    /* renamed from: ۦۧۥۦ, reason: contains not printable characters */
    public static CharBuffer m6380(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((com.github.catvod.spider.merge.E0.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static HashMap m6381() {
        if (C0014.m3353() < 0) {
            return Dm84.b();
        }
        return null;
    }

    /* renamed from: ۧ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static CopyOnWriteArrayList m6382(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((i) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m6383(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0019.m4065() < 0) {
            return ((Quark) obj).playerContent((String) obj2, (String) obj3, (List) obj4);
        }
        return null;
    }

    /* renamed from: ۧۤۢ۠, reason: not valid java name and contains not printable characters */
    public static int m6384(Object obj) {
        if (C0051.m8216() < 0) {
            return ((C0267b) obj).c;
        }
        return 0;
    }

    /* renamed from: ۧۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6385() {
        if (C0011.m2755() >= 0) {
            return "         <div class=\"episodes-title\">📺 ";
        }
        return null;
    }

    /* renamed from: ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static void m6386(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            ((Activity) obj).runOnUiThread((Runnable) obj2);
        }
    }

    /* renamed from: ۨۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m6387(Object obj) {
        if (C0014.m3353() < 0) {
            ((C0233B) obj).b();
        }
    }

    /* renamed from: ۨۧۨۤ, reason: not valid java name and contains not printable characters */
    public static int m6388(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.g) obj).g();
        }
        return 0;
    }

    /* renamed from: ۟ۡۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m6307(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}