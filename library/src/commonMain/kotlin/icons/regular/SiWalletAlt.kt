package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiWalletAlt: ImageVector
    get() {
        if (_SiWalletAlt != null) {
            return _SiWalletAlt!!
        }
        _SiWalletAlt = ImageVector.Builder(
            name = "Regular.SiWalletAlt",
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
                moveTo(5f, 3f)
                horizontalLineToRelative(12.6f)
                curveTo(20.58f, 3f, 23f, 5.42f, 23f, 8.4f)
                verticalLineTo(17f)
                moveTo(4.4f, 6f)
                horizontalLineToRelative(13.2f)
                curveTo(18.925f, 6f, 20f, 7.164f, 20f, 8.6f)
                verticalLineToRelative(9.8f)
                curveToRelative(0f, 1.436f, -1.075f, 2.6f, -2.4f, 2.6f)
                horizontalLineTo(4.4f)
                curveTo(3.075f, 21f, 2f, 19.836f, 2f, 18.4f)
                verticalLineTo(8.6f)
                curveTo(2f, 7.164f, 3.075f, 6f, 4.4f, 6f)
                moveTo(17f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            }
        }.build()

        return _SiWalletAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiWalletAlt: ImageVector? = null
