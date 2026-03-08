package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAlignTopDetailed: ImageVector
    get() {
        if (_SiAlignTopDetailed != null) {
            return _SiAlignTopDetailed!!
        }
        _SiAlignTopDetailed = ImageVector.Builder(
            name = "Regular.SiAlignTopDetailed",
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
                moveTo(2f, 2f)
                horizontalLineToRelative(20f)
                moveToRelative(-6.4f, 4f)
                horizontalLineToRelative(1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7.6f)
                verticalLineToRelative(4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -1.6f)
                verticalLineTo(7.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.6f, 6f)
                moveToRelative(-9f, 0f)
                horizontalLineToRelative(1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 7.6f)
                verticalLineToRelative(12.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 22f)
                horizontalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 20.4f)
                verticalLineTo(7.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 6f)
            }
        }.build()

        return _SiAlignTopDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignTopDetailed: ImageVector? = null
