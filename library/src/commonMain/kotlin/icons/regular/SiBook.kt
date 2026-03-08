package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiBook: ImageVector
    get() {
        if (_SiBook != null) {
            return _SiBook!!
        }
        _SiBook = ImageVector.Builder(
            name = "Regular.SiBook",
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
                moveTo(12f, 7.333f)
                curveTo(12f, 5.5f, 10.5f, 4f, 8.667f, 4f)
                horizontalLineTo(2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(6.708f)
                curveTo(12f, 16f, 12f, 19.334f, 12f, 19.334f)
                moveToRelative(0f, -12f)
                curveTo(12f, 5.5f, 13.5f, 4f, 15.333f, 4f)
                horizontalLineTo(22f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-6.667f)
                curveTo(12f, 16f, 12f, 19.334f, 12f, 19.334f)
                moveToRelative(0f, -12f)
                verticalLineToRelative(12f)
                moveToRelative(1.875f, 1.124f)
                arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.167f, 19f)
                horizontalLineTo(21f)
                moveToRelative(-10.875f, 1.458f)
                arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.833f, 19f)
                horizontalLineTo(3f)
            }
        }.build()

        return _SiBook!!
    }

@Suppress("ObjectPropertyName")
private var _SiBook: ImageVector? = null
