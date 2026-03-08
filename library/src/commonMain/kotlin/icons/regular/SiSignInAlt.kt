package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSignInAlt: ImageVector
    get() {
        if (_SiSignInAlt != null) {
            return _SiSignInAlt!!
        }
        _SiSignInAlt = ImageVector.Builder(
            name = "Regular.SiSignInAlt",
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
                moveToRelative(13f, 16f)
                lineToRelative(4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                horizontalLineTo(3f)
                moveToRelative(10.6f, -9f)
                horizontalLineToRelative(5f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(13.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(13f)
            }
        }.build()

        return _SiSignInAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSignInAlt: ImageVector? = null
