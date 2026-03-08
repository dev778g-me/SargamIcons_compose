package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiDollar: ImageVector
    get() {
        if (_SiDollar != null) {
            return _SiDollar!!
        }
        _SiDollar = ImageVector.Builder(
            name = "Duotone.SiDollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.133f, 19.053f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.805f, 0.93f)
                curveToRelative(2.006f, -0.147f, 4.214f, -1.58f, 4.054f, -3.989f)
                curveToRelative(-0.125f, -1.867f, -1.103f, -2.936f, -3.995f, -3.994f)
                reflectiveCurveTo(8.132f, 9.872f, 8.008f, 8.006f)
                curveToRelative(-0.16f, -2.409f, 2.048f, -3.842f, 4.054f, -3.99f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.805f, 0.931f)
                moveTo(12f, 22f)
                verticalLineTo(2f)
            }
        }.build()

        return _SiDollar!!
    }

@Suppress("ObjectPropertyName")
private var _SiDollar: ImageVector? = null
