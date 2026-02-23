package com.github.catvod.spider.merge.f1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.location.GnssStatus;
import android.text.TextPaint;
import android.util.Half;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.github.catvod.spider.Ali;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.Ddrk;
import com.github.catvod.spider.Duboku;
import com.github.catvod.spider.Eighteen;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBmp4;
import com.github.catvod.spider.HBxluo;
import com.github.catvod.spider.HkTv;
import com.github.catvod.spider.KuaKeBa;
import com.github.catvod.spider.Libvio;
import com.github.catvod.spider.PTT;
import com.github.catvod.spider.WebDAV;
import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.F.p;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.l0;
import com.github.catvod.spider.merge.G.d;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0170b;
import com.github.catvod.spider.merge.P0.u;
import com.github.catvod.spider.merge.P0.z;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.i;
import com.github.catvod.spider.merge.W.A;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.X0.v;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.RunnableC0327g;
import com.github.catvod.spider.merge.h0.ViewOnFocusChangeListenerC0326f;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.x0.C0413c;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge.f1.ۣۣۨۤ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0053 {

    /* renamed from: ۟ۥۢۧۥ, reason: not valid java name and contains not printable characters */
    public static int f791 = -151;

    /* renamed from: ۟۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int[] m8388() {
        if (C0017.m3633() < 0) {
            return f.b;
        }
        return null;
    }

    /* renamed from: ۟۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m8389() {
        return 829 ^ C0059.f855;
    }

    /* renamed from: ۟۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Map m8390(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.merge.X.a) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m8391(Object obj, Object obj2, Object obj3) {
        if (C0017.m3633() < 0) {
            ((Ddrk) obj).c((h) obj2, (l) obj3);
        }
    }

    /* renamed from: ۟۟ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static double m8392(double d, double d2) {
        if (C0042.m7147() < 0) {
            return Math.pow(d, d2);
        }
        return 0.0d;
    }

    /* renamed from: ۟۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static List m8393(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).c();
        }
        return null;
    }

    /* renamed from: ۟۟ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.h m8394(Object obj) {
        if (C0050.m8121() < 0) {
            return com.github.catvod.spider.p000mergexbpq.N.a.l((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m8395(Object obj) {
        if (C0062.m9429() > 0) {
            return ((i) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟۟ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m8396(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((JSONArray) obj).length();
        }
        return 0;
    }

    /* renamed from: ۟۠۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static r m8397(Object obj) {
        if (C0047.m7837() > 0) {
            return ((r) obj).z();
        }
        return null;
    }

    /* renamed from: ۟۠۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m8398() {
        if (C0039.m6529() < 0) {
            return HBmp4.a();
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m8399() {
        if (C0034.m6048() <= 0) {
            return PTT.a();
        }
        return null;
    }

    /* renamed from: ۟۠ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static d m8400(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).f();
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m8401(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0050.m8121() <= 0) {
            return ((HBlingDu) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m8402(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge.P0.i) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۠ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8403(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((com.github.catvod.spider.merge.E0.d) obj).d;
        }
        return 0;
    }

    /* renamed from: ۟۠ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static int m8404(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((k) obj).j;
        }
        return 0;
    }

    /* renamed from: ۟ۡۢۥۡ, reason: not valid java name and contains not printable characters */
    public static Format m8405(Object obj, Object obj2, Object obj3) {
        if (C0042.m7147() <= 0) {
            return ((C0170b) obj).a((String) obj2, (Locale) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8406(Object obj) {
        if (C0027.m5017() >= 0) {
            return com.github.catvod.spider.merge.a1.i.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۦۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8407() {
        if (C0009.m2047() > 0) {
            return Libvio.g;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static CountDownLatch m8408(Object obj) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.U.k) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m8409() {
        if (C0023.m4566() < 0) {
            return C0273c.j;
        }
        return 0;
    }

    /* renamed from: ۟ۢ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static C m8410(Object obj) {
        if (C0002.m1242() > 0) {
            return ((C) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m8411() {
        if (C0015.m3433() >= 0) {
            return "\\&伦理.*?情色";
        }
        return null;
    }

    /* renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8412(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).p0();
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m8413(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            return Eighteen.a((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.I.i m8414(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).j();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m8415(Object obj, int i) {
        if (C0005.m1599() <= 0) {
            ((TextView) obj).setMaxLines(i);
        }
    }

    /* renamed from: ۟ۤۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8416() {
        if (C0031.m5628() >= 0) {
            return "\" tabindex = \"-1\">\n                        </div>\n                        <button class=\"send-button\" id=\"sendBtn\" tabindex = \"-1\">发送</button>\n                    </div>\n                </div>\n            </div>\n        </div>\n\n        <!-- 响应消息区域 -->\n        <div class=\"response-message\" id=\"responseMessage\"></div>\n\n        <!-- 选集卡片 -->\n        <div class=\"episodes-card\" style=\"background: rgba(255, 255, 255, 0.95); backdrop-filter: blur(20px); border-radius: 12px; padding: 15px; box-shadow: 0 6px 24px rgba(52, 152, 219, 0.1), 0 3px 12px rgba(0, 0, 0, 0.04); border: 1.5px solid rgba(52, 152, 219, 0.1); position: relative; z-index: 1;\">\n            <h3 style=\"margin: 0 0 15px 0; text-align: center;\">📺 选集列表</h3>\n            <div class=\"source-container\" style=\"background: none; border: none; box-shadow: none; padding: 0; margin: 0;\">";
        }
        return null;
    }

    /* renamed from: ۟ۤۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0152i m8417(Object obj) {
        if (C0050.m8121() < 0) {
            return ((l0) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۢۨ, reason: not valid java name and contains not printable characters */
    public static int m8418(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((LinearLayout.LayoutParams) obj).bottomMargin;
        }
        return 0;
    }

    /* renamed from: ۟ۤۦۥۡ, reason: not valid java name and contains not printable characters */
    public static String m8419(int i) {
        if (C0032.m5686() <= 0) {
            return Duboku.d(i);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m8420(Object obj) {
        if (C0036.m6252() > 0) {
            return Channels.newInputStream((ReadableByteChannel) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8421(Object obj) {
        if (C0055.m8740() > 0) {
            return ((com.github.catvod.spider.merge.W.C) obj).d;
        }
        return false;
    }

    /* renamed from: ۟ۥۢۨ۠, reason: not valid java name and contains not printable characters */
    public static long m8422(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).n;
        }
        return 0L;
    }

    /* renamed from: ۟ۥۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m8423(Object obj) {
        if (C0055.m8740() > 0) {
            ((HBmoou) obj).getInfo();
        }
    }

    /* renamed from: ۟ۥۧۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m8424(Object obj, Object obj2, Object obj3) {
        if (C0032.m5686() < 0) {
            return ((HashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥۨۡ۟, reason: not valid java name and contains not printable characters */
    public static z m8425() {
        if (C0027.m5017() > 0) {
            return z.d;
        }
        return null;
    }

    /* renamed from: ۟ۥۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m8426() {
        if (C0040.m6582() > 0) {
            return "encrypt";
        }
        return null;
    }

    /* renamed from: ۟ۦ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static Half m8427(Object obj) {
        if (C0020.m4210() <= 0) {
            return Half.valueOf((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۣۢ, reason: not valid java name and contains not printable characters */
    public static String m8428(Object obj) {
        if (C0024.m4693() <= 0) {
            return g.l((m) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8429(Object obj) {
        if (C0015.m3433() >= 0) {
            ((p) obj).a();
        }
    }

    /* renamed from: ۟ۦۧۨ۟, reason: not valid java name and contains not printable characters */
    public static String m8430() {
        if (C0061.m9359() <= 0) {
            return "/proxy?do=seachdanmu&go=senddanmu&username=${encodeURIComponent(username)}&message=${encodeURIComponent(message)}`;\n\n        fetch(url)\n            .then(response => {\n                if (!response.ok) {\n                    throw new Error('发送失败');\n                }\n                return response.text();\n            })\n            .then(data => {\n                showMessage('弹幕发送成功！', 'success');\n                document.getElementById('message').value = '';\n            })\n            .catch(error => {\n                showMessage('发送失败：' + error.message, 'error');\n            });\n    }\n\n    // 清空表单\n    function clearForm() {\n        const messageInput = document.getElementById('message');\n        if (messageInput) {\n            messageInput.value = '';\n            hideMessage();\n            messageInput.focus();\n        }\n    }\n\n    // 显示消息\n    function showMessage(text, type) {\n        const messageDiv = document.getElementById('messageDiv');\n        if (messageDiv) {\n            messageDiv.textContent = text;\n            messageDiv.className = `message ${type}`;\n            messageDiv.style.display = 'block';\n\n            setTimeout(() => {\n                hideMessage();\n            }, 3000);\n        }\n    }\n\n    // 隐藏消息\n    function hideMessage() {\n        const messageDiv = document.getElementById('messageDiv');\n        if (messageDiv) {\n            messageDiv.style.display = 'none';\n        }\n    }\n\n    // 电视用户扫码推送功能\n    function sendBackgroundRequest() {\n        const url = `";
        }
        return null;
    }

    /* renamed from: ۟ۧۤۦۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.m m8431() {
        if (C0004.m1557() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.c0.m.g;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۦۨ, reason: not valid java name and contains not printable characters */
    public static String m8432(Object obj) {
        if (C0008.m1975() >= 0) {
            return KuaKeBa.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static int m8433() {
        if (C0044.m7508() < 0) {
            return C0054.m8598();
        }
        return 0;
    }

    /* renamed from: ۟ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static String m8434(String str) {
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

    /* renamed from: ۠۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8435(Object obj) {
        if (C0055.m8740() > 0) {
            return ((u) obj).a;
        }
        return null;
    }

    /* renamed from: ۠۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8436(Object obj, int i) {
        if (C0064.m9659() <= 0) {
            return ((GnssStatus) obj).hasAlmanacData(i);
        }
        return false;
    }

    /* renamed from: ۠۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m8437(Object obj, int i, Object obj2) {
        if (C0064.m9659() < 0) {
            ((o) obj).e(i, (com.github.catvod.spider.merge.E0.p) obj2);
        }
    }

    /* renamed from: ۠ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8438(Object obj) {
        if (C0000.m1116() < 0) {
            return ((l) obj).e();
        }
        return null;
    }

    /* renamed from: ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8439(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return ((com.github.catvod.spider.merge.H0.f) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8440() {
        if (C0051.m8216() <= 0) {
            return HkTv.e;
        }
        return null;
    }

    /* renamed from: ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m8441(Object obj, boolean z) {
        if (C0052.m8320() >= 0) {
            ((View) obj).setLongClickable(z);
        }
    }

    /* renamed from: ۣۡۥۧ, reason: not valid java name and contains not printable characters */
    public static void m8442(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            ((com.github.catvod.spider.p000mergexbpq.c.g) obj).f((String) obj2);
        }
    }

    /* renamed from: ۡۤۧۥ, reason: not valid java name and contains not printable characters */
    public static String m8443() {
        if (C0002.m1242() >= 0) {
            return "片";
        }
        return null;
    }

    /* renamed from: ۡۥۥۢ, reason: not valid java name and contains not printable characters */
    public static void m8444(Object obj, int i) {
        if (C0008.m1975() >= 0) {
            ((Drawable) obj).setTint(i);
        }
    }

    /* renamed from: ۢ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m8445(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.merge.V0.c) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۤۧۧ, reason: not valid java name and contains not printable characters */
    public static String m8446(Object obj) {
        if (C0057.m9017() > 0) {
            return com.github.catvod.spider.merge.D.f.n((String) obj);
        }
        return null;
    }

    /* renamed from: ۢۥۥۡ, reason: not valid java name and contains not printable characters */
    public static String m8447() {
        if (C0021.m4379() >= 0) {
            return "列数";
        }
        return null;
    }

    /* renamed from: ۢۦۦۣ, reason: not valid java name and contains not printable characters */
    public static int[] m8448(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).g;
        }
        return null;
    }

    /* renamed from: ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m8449(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((ViewOnFocusChangeListenerC0326f) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m8450(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0058.m9131() <= 0) {
            return ((HBxluo) obj).searchContent((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m8451(Object obj) {
        if (C0063.m9589() < 0) {
            return ((A) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8452(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((C0413c) obj).d;
        }
        return 0;
    }

    /* renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8453() {
        if (C0033.m5872() > 0) {
            return Thread.interrupted();
        }
        return false;
    }

    /* renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static void m8454(Object obj, Object obj2) {
        if (C0051.m8216() < 0) {
            ((Spinner) obj).setAdapter((SpinnerAdapter) obj2);
        }
    }

    /* renamed from: ۣۥۣ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.m m8455(Object obj) {
        if (C0018.m3956() > 0) {
            return ((com.github.catvod.spider.merge.V0.d) obj).g();
        }
        return null;
    }

    /* renamed from: ۤ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m8456() {
        if (C0063.m9589() < 0) {
            return ApplvDV2.d;
        }
        return null;
    }

    /* renamed from: ۤۢۦ۟, reason: not valid java name and contains not printable characters */
    public static Collection m8457(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((LinkedHashMap) obj).values();
        }
        return null;
    }

    /* renamed from: ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8458(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((AppZzun) obj).b();
        }
        return null;
    }

    /* renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static Pattern m8459(Object obj) {
        if (C0064.m9659() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).g;
        }
        return null;
    }

    /* renamed from: ۥ۟ۥۦ, reason: contains not printable characters */
    public static void m8460(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            ((C0232A) obj).e((j) obj2);
        }
    }

    /* renamed from: ۥۣۤۢ, reason: contains not printable characters */
    public static int m8461(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.merge.T0.g) obj).g;
        }
        return 0;
    }

    /* renamed from: ۥۥۡۡ, reason: contains not printable characters */
    public static boolean m8462(Object obj, Object obj2) {
        if (C0014.m3353() <= 0) {
            return ((O) obj).j((String[]) obj2);
        }
        return false;
    }

    /* renamed from: ۥۦۥۣ, reason: contains not printable characters */
    public static int m8463(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۥۨۦ۟, reason: contains not printable characters */
    public static String m8464(Object obj) {
        if (C0060.m9355() >= 0) {
            return com.github.catvod.spider.merge.D.f.h((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۨۧ۠, reason: contains not printable characters */
    public static String m8465() {
        if (C0041.m6823() < 0) {
            return "调试->webViewDialog验证后post错：";
        }
        return null;
    }

    /* renamed from: ۦ۟ۧ۠, reason: contains not printable characters */
    public static float m8466(Object obj) {
        if (C0012.m3024() > 0) {
            return ((TextPaint) obj).getLetterSpacing();
        }
        return 0.0f;
    }

    /* renamed from: ۦ۟ۨۧ, reason: contains not printable characters */
    public static ArrayList m8467(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (m8389() > 0) {
            return ((M) obj).n((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۦۣۨ۠, reason: contains not printable characters */
    public static String m8468(Object obj) {
        if (C0008.m1975() > 0) {
            return ((WebDAV) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m8469() {
        if (C0059.m9257() <= 0) {
            return "a";
        }
        return null;
    }

    /* renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8470(Object obj) {
        if (C0052.m8320() > 0) {
            return ((com.github.catvod.spider.merge.e1.b) obj).d();
        }
        return false;
    }

    /* renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static C0335o m8471(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((RunnableC0327g) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۤۥ۠, reason: not valid java name and contains not printable characters */
    public static LinearLayout m8472(Object obj) {
        if (C0005.m1599() < 0) {
            return ((C0340u) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۧۤۡ, reason: not valid java name and contains not printable characters */
    public static void m8473(Object obj, Object obj2) {
        if (C0052.m8320() >= 0) {
            ((com.github.catvod.spider.p000mergexbpq.c.g) obj).i((String) obj2);
        }
    }

    /* renamed from: ۨ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static float m8474(int i) {
        if (C0034.m6048() < 0) {
            return Color.luminance(i);
        }
        return 0.0f;
    }

    /* renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.h m8475(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((r) obj).y();
        }
        return null;
    }

    /* renamed from: ۣۨۧۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m8476(Object obj) {
        if (C0003.m1463() < 0) {
            return Ali.proxy((Map) obj);
        }
        return null;
    }

    /* renamed from: ۨۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m8478(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((v) obj).e;
        }
        return null;
    }

    /* renamed from: ۨۦۢۢ, reason: not valid java name and contains not printable characters */
    public static String m8477(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}