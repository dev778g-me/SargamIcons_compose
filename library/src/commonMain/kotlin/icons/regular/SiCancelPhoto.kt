package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiCancelPhoto: ImageVector
    get() {
        if (_SiCancelPhoto != null) {
            return _SiCancelPhoto!!
        }
        _SiCancelPhoto = ImageVector.Builder(
            name = "Regular.SiCancelPhoto",
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
                moveTo(20f, 22f)
                horizontalLineTo(8.4f)
                curveTo(5.42f, 22f, 3f, 19.58f, 3f, 16.6f)
                verticalLineTo(5f)
                moveToRelative(13.828f, 8.828f)
                lineToRelative(-5.656f, -5.656f)
                moveToRelative(5.656f, 0f)
                lineToRelative(-5.656f, 5.656f)
                moveTo(8.4f, 3f)
                horizontalLineToRelative(11.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5.4f)
                verticalLineToRelative(11.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(8.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 3f)
            }
        }.build()

        return _SiCancelPhoto!!
    }

@Suppress("ObjectPropertyName")
private var _SiCancelPhoto: ImageVector? = null
