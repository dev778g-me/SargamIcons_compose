package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiWalletDetailed: ImageVector
    get() {
        if (_SiWalletDetailed != null) {
            return _SiWalletDetailed!!
        }
        _SiWalletDetailed = ImageVector.Builder(
            name = "Regular.SiWalletDetailed",
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
                moveTo(3f, 8.5f)
                verticalLineToRelative(-3f)
                moveToRelative(0f, 0f)
                curveTo(3f, 4.67f, 3.67f, 4f, 4.5f, 4f)
                lineToRelative(11.99f, -1f)
                curveTo(17.88f, 3f, 19f, 4.06f, 19f, 5.38f)
                verticalLineTo(7f)
                horizontalLineTo(4.5f)
                curveTo(3.67f, 7f, 3f, 6.33f, 3f, 5.5f)
                moveTo(21f, 11f)
                horizontalLineToRelative(-6.286f)
                curveToRelative(-0.947f, 0f, -1.714f, 0.716f, -1.714f, 1.6f)
                verticalLineToRelative(2.8f)
                curveToRelative(0f, 0.884f, 0.768f, 1.6f, 1.714f, 1.6f)
                horizontalLineTo(21f)
                moveToRelative(-5f, -3f)
                horizontalLineToRelative(0.01f)
                moveTo(4.2f, 7f)
                horizontalLineToRelative(14.4f)
                curveTo(19.92f, 7f, 21f, 8.08f, 21f, 9.4f)
                verticalLineToRelative(9.2f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.08f, 21f, 3f, 19.92f, 3f, 18.6f)
                verticalLineTo(8.2f)
                curveTo(3f, 7.54f, 3.54f, 7f, 4.2f, 7f)
            }
        }.build()

        return _SiWalletDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiWalletDetailed: ImageVector? = null
