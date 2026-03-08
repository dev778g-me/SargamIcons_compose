package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiWallet: ImageVector
    get() {
        if (_SiWallet != null) {
            return _SiWallet!!
        }
        _SiWallet = ImageVector.Builder(
            name = "Regular.SiWallet",
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
                moveTo(21f, 9f)
                verticalLineTo(6.4f)
                curveToRelative(0f, -1.325f, -0.88f, -2.4f, -1.964f, -2.4f)
                horizontalLineTo(2.964f)
                curveTo(1.879f, 4f, 1f, 5.075f, 1f, 6.4f)
                verticalLineToRelative(11.2f)
                curveToRelative(0f, 1.325f, 0.88f, 2.4f, 1.964f, 2.4f)
                horizontalLineToRelative(16.072f)
                curveTo(20.121f, 20f, 21f, 18.925f, 21f, 17.6f)
                verticalLineTo(15f)
                moveToRelative(-1f, -3f)
                horizontalLineToRelative(0.01f)
                moveTo(16.6f, 9f)
                horizontalLineToRelative(4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                verticalLineToRelative(2.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -1.6f)
                verticalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.6f, 9f)
            }
        }.build()

        return _SiWallet!!
    }

@Suppress("ObjectPropertyName")
private var _SiWallet: ImageVector? = null
