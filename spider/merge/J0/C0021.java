package com.github.catvod.spider.merge.J0;

import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.graphics.Canvas;
import android.os.LocaleList;
import android.os.Looper;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.github.catvod.spider.Cupfox;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBCupfox;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBgetappapi;
import com.github.catvod.spider.HBheiHu;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.Jianpian;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.PTT;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.P;
import com.github.catvod.spider.merge.F0.f0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.M.e;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.w;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.q;
import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0217w;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.f;
import com.github.catvod.spider.merge.a1.i;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.n;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.RunnableC0317F;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.w.C0400d;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.r;
import com.github.catvod.spider.p000mergexbpq.P.y;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.j;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c.g;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.d0.D;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.n0.b;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.BitSet;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.J0.۟ۤۦۣ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0021 {

    /* renamed from: ۟ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static int f461 = -606;

    /* renamed from: ۟۟۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static Locale m4298(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            return ((LocaleList) obj).getFirstMatch((String[]) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static b m4299(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.n0.a) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4300(Object obj, Object obj2, Object obj3) {
        if (C0056.m8886() <= 0) {
            return ((Jianpian) obj).searchContent((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4301() {
        if (C0012.m3024() > 0) {
            return "url=http";
        }
        return null;
    }

    /* renamed from: ۟۠ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4302(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            ((PrintWriter) obj).print((String) obj2);
        }
    }

    /* renamed from: ۟۠ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m4303(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            ((AccessibilityNodeInfo) obj).setTouchDelegateInfo((AccessibilityNodeInfo.TouchDelegateInfo) obj2);
        }
    }

    /* renamed from: ۟۠ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static int m4304(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((P) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۡ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4305(Object obj) {
        if (C0062.m9429() > 0) {
            return ((h) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4306(Object obj, int i) {
        if (C0044.m7508() < 0) {
            return ((Matcher) obj).group(i);
        }
        return null;
    }

    /* renamed from: ۟ۢۡۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4307(String str) {
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

    /* renamed from: ۣ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4308(Object obj, Object obj2) {
        if (C0045.m7538() < 0) {
            ((g) obj).c((String) obj2);
        }
    }

    /* renamed from: ۣ۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m4309() {
        if (C0009.m2047() > 0) {
            return f.a();
        }
        return null;
    }

    /* renamed from: ۟ۢۦۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4310(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((Jianpian) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static String m4311(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0055.m8740() >= 0) {
            return ((HBmoou) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4312() {
        if (C0034.m6048() < 0) {
            return "list";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4313() {
        if (C0015.m3433() >= 0) {
            return "解析";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4314(Object obj, int i) {
        if (C0043.m7332() > 0) {
            return ((HttpURLConnection) obj).getHeaderField(i);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m4315(Object obj, Object obj2, int i) {
        if (C0046.m7701() >= 0) {
            return ((Quark) obj).detailContentVodPlayFrom((List) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Locale m4316(Object obj) {
        if (C0030.m5375() > 0) {
            return ((w) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۧۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m4317(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((HBCupfox) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m4318(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5) {
        if (C0044.m7508() <= 0) {
            ((y) obj).c((com.github.catvod.spider.p000mergexbpq.P.w) obj2, (com.github.catvod.spider.p000mergexbpq.R.b) obj3, i, i2, (BitSet) obj4, (com.github.catvod.spider.p000mergexbpq.Q.f) obj5);
        }
    }

    /* renamed from: ۟ۤ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m4319(Object obj, Object obj2, int i, int i2) {
        if (C0017.m3633() < 0) {
            return C0174a.c((char[]) obj, (String[]) obj2, i, i2);
        }
        return null;
    }

    /* renamed from: ۟ۤۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4320(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((e) obj).g();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4321(Object obj, int i) {
        if (C0015.m3433() >= 0) {
            ((j) obj).a(i);
        }
    }

    /* renamed from: ۟ۤۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4322(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((f0) obj).d;
        }
        return 0;
    }

    /* renamed from: ۟ۤۡۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4323(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((D) obj).e();
        }
        return false;
    }

    /* renamed from: ۟ۥ۟۠۠, reason: not valid java name and contains not printable characters */
    public static String m4324(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.merge.f1.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4325() {
        if (C0003.m1463() < 0) {
            return "getPlayHeaders()错误！-->";
        }
        return null;
    }

    /* renamed from: ۟ۥۣۥۧ, reason: not valid java name and contains not printable characters */
    public static String m4326(Object obj) {
        if (C0042.m7147() < 0) {
            return ((E) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int m4327(Object obj) {
        if (C0016.m3596() < 0) {
            return ((com.github.catvod.spider.merge.X0.e) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۥۨۢۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.f m4328(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((o) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۦۡۦۡ, reason: not valid java name and contains not printable characters */
    public static q m4329(Object obj, Object obj2, Object obj3) {
        if (C0052.m8320() >= 0) {
            return ((q) obj).x((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m4330() {
        if (C0056.m8886() <= 0) {
            return "/proxy?do=seachdanmu&go=senddanmu&username=${encodeURIComponent(username)}&message=${encodeURIComponent(message)}`;\n            fetch(url)\n                .then(res => res.text())\n                .then(text => {\n                    showStatus(text || '弹幕已发送成功！', 'success');\n                    messageEl.value = '';\n                })\n                .catch(err => showStatus('弹幕已发送成功！', 'success'));\n        }\n        \n        // 更新可聚焦元素列表\n        function updateFocusableElements() {\n            const newFocusable = document.querySelectorAll('a[href], button, input, textarea');\n            focusArray.length = 0;\n            focusArray.push(...Array.from(newFocusable).filter(el => !el.disabled && el.tabIndex !== -1));\n        }\n\n        // 显示状态消息\n        function showStatus(text, type) {\n            statusMessage.textContent = text;\n            statusMessage.className = 'status-message';\n            if (type === 'success') statusMessage.style.backgroundColor = '#006400';\n            else if (type === 'failure') statusMessage.style.backgroundColor = '#c0392b';\n            else if (type === 'info') statusMessage.style.backgroundColor = '#3498db';\n            statusMessage.classList.add('show');\n            setTimeout(() => statusMessage.classList.remove('show'), 3000);\n        }\n    </script>\n</body>\n</html>\n";
        }
        return null;
    }

    /* renamed from: ۟ۦۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m4331(Object obj) {
        if (C0027.m5017() > 0) {
            return ((Notice) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static Thread m4332(Object obj) {
        if (C0062.m9429() > 0) {
            return ((Looper) obj).getThread();
        }
        return null;
    }

    /* renamed from: ۟ۧ۟۟۟, reason: not valid java name and contains not printable characters */
    public static JSONArray m4333(Object obj, Object obj2) {
        if (C0003.m1463() <= 0) {
            return ((JSONObject) obj).getJSONArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m4334(Object obj) {
        if (C0038.m6471() >= 0) {
            ((r) obj).a();
        }
    }

    /* renamed from: ۟ۧ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4335(Object obj) {
        if (C0047.m7837() >= 0) {
            return HBmoou.sha1((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4336(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0040.m6582() > 0) {
            return ((HBDmSou) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4337(Object obj) {
        if (C0052.m8320() >= 0) {
            return i.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static Activity m4338(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((Fragment) obj).getActivity();
        }
        return null;
    }

    /* renamed from: ۠ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String[] m4339() {
        if (C0006.m1726() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.g0.D.p;
        }
        return null;
    }

    /* renamed from: ۠ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static String m4341(Object obj) {
        if (C0013.m3167() > 0) {
            return ((TextPaint) obj).getFontFeatureSettings();
        }
        return null;
    }

    /* renamed from: ۡۡۦۨ, reason: not valid java name and contains not printable characters */
    public static String m4342() {
        if (C0007.m1886() >= 0) {
            return "全部";
        }
        return null;
    }

    /* renamed from: ۡۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4343() {
        if (C0040.m6582() >= 0) {
            return "播放请求头";
        }
        return null;
    }

    /* renamed from: ۡۡۨۦ, reason: not valid java name and contains not printable characters */
    public static Runnable m4344(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((Notice) obj).e;
        }
        return null;
    }

    /* renamed from: ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static List m4345(Object obj) {
        if (C0015.m3433() > 0) {
            return ((l) obj).q0();
        }
        return null;
    }

    /* renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static String m4346(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0053.m8389() >= 0) {
            return ((PTT) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m4347(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((String) obj).getBytes((String) obj2);
        }
        return null;
    }

    /* renamed from: ۡۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4348(Object obj) {
        if (C0041.m6823() < 0) {
            p.h((p) obj);
        }
    }

    /* renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4349() {
        if (C0059.m9257() < 0) {
            return "五次跳转播放链接";
        }
        return null;
    }

    /* renamed from: ۢۤۦۧ, reason: not valid java name and contains not printable characters */
    public static Buffer m4350(Object obj, int i) {
        if (C0050.m8121() <= 0) {
            return ((IntBuffer) obj).position(i);
        }
        return null;
    }

    /* renamed from: ۢۧۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4351(Object obj, Object obj2) {
        if (C0059.m9257() < 0) {
            com.github.catvod.spider.merge.E0.h.a((o) obj, (com.github.catvod.spider.merge.H0.f) obj2);
        }
    }

    /* renamed from: ۣۢۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4352(Object obj) {
        if (C0010.m2320() < 0) {
            return ((AccessibleObject) obj).isAccessible();
        }
        return false;
    }

    /* renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4353(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((View) obj).getPaddingStart();
        }
        return 0;
    }

    /* renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static URL m4354(Object obj, Object obj2) {
        if (C0025.m4797() >= 0) {
            return com.github.catvod.spider.merge.S0.b.h((URL) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۦۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4355(Object obj, Object obj2) {
        if (C0037.m6350() < 0) {
            return ((List) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۣۣۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4356() {
        if (C0026.m4977() <= 0) {
            return "/text()";
        }
        return null;
    }

    /* renamed from: ۤۥۢۤ, reason: not valid java name and contains not printable characters */
    public static Throwable m4357(Object obj) {
        if (C0020.m4210() < 0) {
            return ((InvocationTargetException) obj).getCause();
        }
        return null;
    }

    /* renamed from: ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m4358(Object obj) {
        if (C0019.m4065() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).z;
        }
        return null;
    }

    /* renamed from: ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4359(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4360(Object obj, Object obj2, int i) {
        if (C0009.m2047() > 0) {
            ((AccessibilityNodeInfo) obj).setTraversalAfter((View) obj2, i);
        }
    }

    /* renamed from: ۤۨۧۨ, reason: not valid java name and contains not printable characters */
    public static void m4361(Object obj) {
        if (C0000.m1116() < 0) {
            ((View) obj).invalidate();
        }
    }

    /* renamed from: ۥ۠ۤۥ, reason: contains not printable characters */
    public static int m4362(Object obj) {
        if (C0050.m8121() < 0) {
            return ((AbstractC0152i) obj).c;
        }
        return 0;
    }

    /* renamed from: ۥ۠ۨۥ, reason: contains not printable characters */
    public static boolean m4363(Object obj) {
        if (C0025.m4797() > 0) {
            return ((RunnableC0317F) obj).c;
        }
        return false;
    }

    /* renamed from: ۥۣۡ۟, reason: contains not printable characters */
    public static String m4364(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0017.m3633() < 0) {
            return ((HBheiHu) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۥۧۦۤ, reason: contains not printable characters */
    public static int m4365(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            return ((Date) obj).compareTo((Date) obj2);
        }
        return 0;
    }

    /* renamed from: ۦۡ۟۟, reason: contains not printable characters */
    public static void m4366(Object obj, int i) {
        if (C0053.m8389() > 0) {
            ((ProgressDialog) obj).setProgressStyle(i);
        }
    }

    /* renamed from: ۦۡۨ۟, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.Z0.a m4367(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((C0147d) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۢۨ۟, reason: contains not printable characters */
    public static boolean m4368(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((View) obj).isPressed();
        }
        return false;
    }

    /* renamed from: ۦۧۡۡ, reason: contains not printable characters */
    public static Class m4369(Object obj) {
        if (C0019.m4065() < 0) {
            return Class.forName((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۧۧ, reason: contains not printable characters */
    public static ExecutorService m4370(int i) {
        if (C0059.m9257() <= 0) {
            return Executors.newFixedThreadPool(i);
        }
        return null;
    }

    /* renamed from: ۧ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.h m4371(Object obj) {
        if (C0029.m5282() > 0) {
            return ((C0400d) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m4372(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((Jianpian) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۥۢۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m4373(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((FishHxq) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m4374(Object obj) {
        if (C0020.m4210() < 0) {
            ((C0340u) obj).e();
        }
    }

    /* renamed from: ۧۦۧۦ, reason: not valid java name and contains not printable characters */
    public static int m4375(Object obj) {
        if (C0001.m1164() < 0) {
            return ((Canvas) obj).save();
        }
        return 0;
    }

    /* renamed from: ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static String m4376(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            return com.github.catvod.spider.merge.D.f.w((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.l0.j m4377(Object obj, Object obj2, Object obj3) {
        if (C0010.m2320() <= 0) {
            return m.c((com.github.catvod.spider.merge.l0.i) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۨ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4378(Object obj, float f) {
        if (C0033.m5872() > 0) {
            ((Button) obj).setElevation(f);
        }
    }

    /* renamed from: ۨ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m4379() {
        return 589 ^ C0050.f771;
    }

    /* renamed from: ۣۨۦۤ, reason: not valid java name and contains not printable characters */
    public static Map m4380(Object obj) {
        if (C0044.m7508() < 0) {
            return ((HBgetappapi) obj).getHeaders();
        }
        return null;
    }

    /* renamed from: ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m4381(Object obj) {
        if (C0051.m8216() < 0) {
            return ((com.github.catvod.spider.merge.U.p) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۤۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4382(Object obj) throws IOException {
        if (C0039.m6529() < 0) {
            ((Reader) obj).reset();
        }
    }

    /* renamed from: ۨۤۨ۟, reason: not valid java name and contains not printable characters */
    public static C0217w m4383() {
        if (C0031.m5628() >= 0) {
            return B.f;
        }
        return null;
    }

    /* renamed from: ۨۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4384() {
        if (C0041.m6823() < 0) {
            return "</span>\n        </button>";
        }
        return null;
    }

    /* renamed from: ۨۦۨ۟, reason: not valid java name and contains not printable characters */
    public static Pattern m4385(Object obj) {
        if (C0064.m9659() < 0) {
            return ((Cupfox) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4386(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((n) obj).a;
        }
        return 0;
    }

    /* renamed from: ۠ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4340(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}