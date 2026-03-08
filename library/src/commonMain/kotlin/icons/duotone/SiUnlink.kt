package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiUnlink: ImageVector
    get() {
        if (_SiUnlink != null) {
            return _SiUnlink!!
        }
        _SiUnlink = ImageVector.Builder(
            name = "Duotone.SiUnlink",
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
                moveToRelative(12f, 7.729f)
                lineToRelative(2.711f, -2.715f)
                arcToRelative(3.028f, 3.028f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.168f, 2.14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.904f, 2.131f)
                lineTo(16.267f, 12f)
                moveTo(12f, 16.238f)
                lineTo(9.251f, 18.99f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.252f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.022f, -4.237f)
                lineTo(7.766f, 12f)
                moveToRelative(8.674f, 4.44f)
                lineToRelative(2.122f, 2.122f)
                moveTo(5.438f, 5.379f)
                lineTo(7.56f, 7.5f)
                moveToRelative(10.253f, 6.75f)
                horizontalLineTo(21f)
                moveTo(14.25f, 18f)
                verticalLineToRelative(3f)
                moveTo(9.75f, 6.188f)
                verticalLineTo(3f)
                moveTo(6.188f, 9.75f)
                horizontalLineTo(3f)
            }
        }.build()

        return _SiUnlink!!
    }

@Suppress("ObjectPropertyName")
private var _SiUnlink: ImageVector? = null
