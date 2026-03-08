package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAIEdit: ImageVector
    get() {
        if (_SiAIEdit != null) {
            return _SiAIEdit!!
        }
        _SiAIEdit = ImageVector.Builder(
            name = "Regular.SiAIEdit",
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
                moveToRelative(14.829f, 6.343f)
                lineToRelative(2.828f, 2.829f)
                moveToRelative(0.566f, -5.091f)
                lineToRelative(1.697f, 1.697f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.131f)
                lineTo(8.464f, 18.364f)
                lineToRelative(-3.535f, 0.707f)
                lineToRelative(0.707f, -3.535f)
                lineTo(17.091f, 4.08f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.132f, 0f)
                moveTo(4.806f, 2.776f)
                lineToRelative(-0.377f, 1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, 0.145f)
                lineToRelative(-1.508f, 0.377f)
                curveToRelative(-0.202f, 0.05f, -0.202f, 0.338f, 0f, 0.388f)
                lineToRelative(1.508f, 0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.145f, 0.145f)
                lineToRelative(0.377f, 1.508f)
                curveToRelative(0.05f, 0.202f, 0.338f, 0.202f, 0.388f, 0f)
                lineToRelative(0.377f, -1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.145f, -0.145f)
                lineToRelative(1.508f, -0.377f)
                curveToRelative(0.202f, -0.05f, 0.202f, -0.338f, 0f, -0.388f)
                lineToRelative(-1.508f, -0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, -0.145f)
                lineToRelative(-0.377f, -1.508f)
                curveToRelative(-0.05f, -0.202f, -0.338f, -0.202f, -0.388f, 0f)
                moveTo(19f, 17f)
                lineToRelative(-0.4f, 1.6f)
                lineToRelative(-1.6f, 0.4f)
                lineToRelative(1.6f, 0.4f)
                lineToRelative(0.4f, 1.6f)
                lineToRelative(0.4f, -1.6f)
                lineTo(21f, 19f)
                lineToRelative(-1.6f, -0.4f)
                close()
            }
        }.build()

        return _SiAIEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIEdit: ImageVector? = null
